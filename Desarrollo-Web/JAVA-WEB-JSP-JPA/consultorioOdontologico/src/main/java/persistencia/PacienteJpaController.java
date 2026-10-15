package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Paciente;
import persistencia.exceptions.NonexistentEntityException;

public class PacienteJpaController {
    private EntityManagerFactory emf;

 public PacienteJpaController(EntityManagerFactory emf) {
    this.emf = emf;
}

    public void create(Paciente paciente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(paciente);
            em.getTransaction().commit();
        } finally { if (em != null) em.close(); }
    }

    public void edit(Paciente paciente) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(paciente);
            em.getTransaction().commit();
        } finally { if (em != null) em.close(); }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente paciente;
            try {
                paciente = em.getReference(Paciente.class, id);
                paciente.getId(); // ⚠️ Cambia a getId_paciente() si tu getter es diferente
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("El paciente con id " + id + " no existe.", enfe);
            }
            em.remove(paciente);
            em.getTransaction().commit();
        } finally { if (em != null) em.close(); }
    }

    public Paciente findPaciente(int id) {
        EntityManager em = getEntityManager();
        try { return em.find(Paciente.class, id); } finally { em.close(); }
    }

    public List<Paciente> findPacienteEntities() { return findPacienteEntities(true, -1, -1); }

    private List<Paciente> findPacienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Paciente.class));
            Query q = em.createQuery(cq);
            if (!all) { q.setMaxResults(maxResults); q.setFirstResult(firstResult); }
            return q.getResultList();
        } finally { em.close(); }
    }

    public int getPacienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Paciente> rt = cq.from(Paciente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally { em.close(); }
    }

  private EntityManager getEntityManager() {
    return emf.createEntityManager();
}
}