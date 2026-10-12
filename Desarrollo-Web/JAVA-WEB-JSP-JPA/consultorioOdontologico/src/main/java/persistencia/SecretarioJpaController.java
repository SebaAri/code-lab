package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Secretario;
import persistencia.exceptions.NonexistentEntityException;

public class SecretarioJpaController {
    private EntityManagerFactory emf;

    public SecretarioJpaController(EntityManagerFactory emf) { 
        this.emf = Persistence.createEntityManagerFactory("Odontologo_UP"); 
    }
    
    public EntityManager getEntityManager() { 
        return emf.createEntityManager(); 
    }

    public void create(Secretario secretario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(secretario);
            em.getTransaction().commit();
        } finally { 
            if (em != null) em.close(); 
        }
    }

    public void edit(Secretario secretario) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(secretario);
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
            Secretario secretario;
            try {
                secretario = em.getReference(Secretario.class, id);
                secretario.getId(); // ✅ Correcto, hereda getId() de Persona
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("El secretario con id " + id + " no existe.", enfe);
            }
            em.remove(secretario);
            em.getTransaction().commit();
        } finally { 
            if (em != null) em.close(); 
        }
    }

    public Secretario findSecretario(int id) {
        EntityManager em = getEntityManager();
        try { 
            return em.find(Secretario.class, id); 
        } finally { 
            em.close(); 
        }
    }

    public List<Secretario> findSecretarioEntities() { 
        return findSecretarioEntities(true, -1, -1); 
    }
    
    public List<Secretario> findSecretarioEntities(int maxResults, int firstResult) { 
        return findSecretarioEntities(false, maxResults, firstResult); 
    }

    private List<Secretario> findSecretarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Secretario.class));
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

    public int getSecretarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Secretario> rt = cq.from(Secretario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally { 
            em.close(); 
        }
    }
}