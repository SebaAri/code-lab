package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Responsable;
import persistencia.exceptions.NonexistentEntityException;

public class ResponsableJpaController {
    private EntityManagerFactory emf;

   public ResponsableJpaController(EntityManagerFactory emf) { 
        this.emf = Persistence.createEntityManagerFactory("Odontologo_UP"); 
    }
    
    public EntityManager getEntityManager() { 
        return emf.createEntityManager(); 
    }

    public void create(Responsable responsable) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(responsable);
            em.getTransaction().commit();
        } finally { 
            if (em != null) em.close(); 
        }
    }

    public void edit(Responsable responsable) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(responsable);
            em.getTransaction().commit();
        } finally { 
            if (em != null) em.close(); 
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Responsable responsable;
            try {
                responsable = em.getReference(Responsable.class, id);
                responsable.getId(); // ✅ Correcto, hereda getId() de Persona
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("El responsable con id " + id + " no existe.", enfe);
            }
            em.remove(responsable);
            em.getTransaction().commit();
        } finally { 
            if (em != null) em.close(); 
        }
    }

    public Responsable findResponsable(int id) {
        EntityManager em = getEntityManager();
        try { 
            return em.find(Responsable.class, id); 
        } finally { 
            em.close(); 
        }
    }

    public List<Responsable> findResponsableEntities() { 
        return findResponsableEntities(true, -1, -1); 
    }
    
    public List<Responsable> findResponsableEntities(int maxResults, int firstResult) { 
        return findResponsableEntities(false, maxResults, firstResult); 
    }

    private List<Responsable> findResponsableEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Responsable.class));
            Query q = em.createQuery(cq);
            if (!all) { 
                q.setMaxResults(maxResults); 
                q.setFirstResult(firstResult); 
            }
            return q.getResultList();
        } finally { 
            em.close(); 
        }
    }

    public int getResponsableCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Responsable> rt = cq.from(Responsable.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally { 
            em.close(); 
        }
    }
}