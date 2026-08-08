package peluqueriacanina.persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import peluqueriacanina.logica.Duenio;
import peluqueriacanina.persistencia.exceptions.NonexistentEntityException;

public class DuenioJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public DuenioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public DuenioJpaController() {
        this.emf = Persistence.createEntityManagerFactory("PeluqueriaCaninaPU"); // Reemplaza por el nombre exacto de tu Unidad de Persistencia (persistence.xml)
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // MÉTODO PARA CREAR / GUARDAR UN DUEÑO
    public void create(Duenio duenio) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(duenio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // MÉTODO PARA EDITAR UN DUEÑO
public void edit(Duenio duenio) throws NonexistentEntityException, Exception {
    EntityManager em = null;
    try {
        em = getEntityManager();
        em.getTransaction().begin();
        duenio = em.merge(duenio);
        em.getTransaction().commit();
    } catch (Exception ex) {
        String msg = ex.getLocalizedMessage();
        if (msg == null || msg.length() == 0) {
            int id = duenio.getId_duenio(); // <-- Ajusta aquí el getter según tu clase Duenio
            if (findDuenio(id) == null) {
                throw new NonexistentEntityException("El dueño con id " + id + " no existe.");
            }
        }
        throw ex;
    } finally {
        if (em != null) {
            em.close();
        }
    }
}

    // MÉTODO PARA ELIMINAR UN DUEÑO
public void destroy(int id) throws NonexistentEntityException {
    EntityManager em = null;
    try {
        em = getEntityManager();
        em.getTransaction().begin();
        Duenio duenio;
        try {
            duenio = em.getReference(Duenio.class, id);
        } catch (EntityNotFoundException enfe) {
            throw new NonexistentEntityException("El dueño con id " + id + " no existe.");
        }
        em.remove(duenio);
        em.getTransaction().commit();
    } finally {
        if (em != null) {
            em.close();
        }
    }
}

    // MÉTODO PARA BUSCAR LISTA COMPLETA DE DUEÑOS
    public List<Duenio> findDuenioEntities() {
        return findDuenioEntities(true, -1, -1);
    }

    private List<Duenio> findDuenioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Duenio.class));
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

    // MÉTODO PARA BUSCAR UN DUEÑO POR ID
    public Duenio findDuenio(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Duenio.class, id);
        } finally {
            em.close();
        }
    }
}
