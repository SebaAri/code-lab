package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Horario;
import persistencia.exceptions.NonexistentEntityException;

public class HorarioJpaController {
    private EntityManagerFactory emf;

    public HorarioJpaController(EntityManagerFactory emf) { 
        this.emf = Persistence.createEntityManagerFactory("Odontologo_UP"); 
    }

    public void create(Horario horario) {
        EntityManager em = null;
        try { em = getEntityManager(); em.getTransaction().begin(); em.persist(horario); em.getTransaction().commit(); } 
        finally { if (em != null) em.close(); }
    }

    public void edit(Horario horario) throws Exception {
        EntityManager em = null;
        try { em = getEntityManager(); em.getTransaction().begin(); em.merge(horario); em.getTransaction().commit(); } 
        finally { if (em != null) em.close(); }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Horario horario;
            try {
                horario = em.getReference(Horario.class, id);
                horario.getId(); // ⚠️ Cambia a getId_horario() si tu getter es diferente
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("El horario con id " + id + " no existe.", enfe);
            }
            em.remove(horario);
            em.getTransaction().commit();
        } finally { if (em != null) em.close(); }
    }

    public Horario findHorario(int id) {
        EntityManager em = getEntityManager();
        try { return em.find(Horario.class, id); } finally { em.close(); }
    }

    public List<Horario> findHorarioEntities() { return findHorarioEntities(true, -1, -1); }
    public List<Horario> findHorarioEntities(int maxResults, int firstResult) { return findHorarioEntities(false, maxResults, firstResult); }

    private List<Horario> findHorarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Horario.class));
            Query q = em.createQuery(cq);
            if (!all) { q.setMaxResults(maxResults); q.setFirstResult(firstResult); }
            return q.getResultList();
        } finally { em.close(); }
    }

    public int getHorarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Horario> rt = cq.from(Horario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally { em.close(); }
    }

    private EntityManager getEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
