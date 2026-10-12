package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Odontologo; // ✅ Cambiado a Odontologo
import persistencia.exceptions.NonexistentEntityException;

public class OdontologoJpaController {
    private EntityManagerFactory emf;

    public OdontologoJpaController(EntityManagerFactory emf) { 
        this.emf = Persistence.createEntityManagerFactory("Odontologo_UP"); 
    }
    
    public EntityManager getEntityManager() { 
        return emf.createEntityManager(); 
    }

    public void create(Odontologo odontologo) { // ✅ Cambiado
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(odontologo);
            em.getTransaction().commit();
        } finally { 
            if (em != null) em.close(); 
        }
    }

    public void edit(Odontologo odontologo) throws Exception { // ✅ Cambiado
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(odontologo);
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
            Odontologo odontologo; // ✅ Cambiado
            try {
                odontologo = em.getReference(Odontologo.class, id);
                odontologo.getId(); // ⚠️ IMPORTANTE: Si tu atributo se llama id_odontologo, cambia esto a: odontologo.getId_odontologo()
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("El odontologo con id " + id + " no existe.", enfe);
            }
            em.remove(odontologo);
            em.getTransaction().commit();
        } finally { 
            if (em != null) em.close(); 
        }
    }

    public Odontologo findOdontologo(int id) { // ✅ Cambiado
        EntityManager em = getEntityManager();
        try { 
            return em.find(Odontologo.class, id); 
        } finally { 
            em.close(); 
        }
    }

    public List<Odontologo> findOdontologoEntities() { return findOdontologoEntities(true, -1, -1); }
    public List<Odontologo> findOdontologoEntities(int maxResults, int firstResult) { return findOdontologoEntities(false, maxResults, firstResult); }

    private List<Odontologo> findOdontologoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Odontologo.class));
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

    public int getOdontologoCount() { // ✅ Cambiado
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Odontologo> rt = cq.from(Odontologo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally { 
            em.close(); 
        }
    }
}