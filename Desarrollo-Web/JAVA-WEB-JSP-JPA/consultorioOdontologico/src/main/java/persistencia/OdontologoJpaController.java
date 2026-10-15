package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;

import logica.Odontologo; // ✅ Cambiado a Odontologo
import persistencia.exceptions.NonexistentEntityException;

public class OdontologoJpaController {
    private final EntityManagerFactory emf;

 public OdontologoJpaController(EntityManagerFactory emf) {
    this.emf = emf;
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

 
public List<Odontologo> findOdontologoEntities() {
    EntityManager em = getEntityManager();

    try {
        return em.createQuery(
            "SELECT o FROM Odontologo o", Odontologo.class
        ).getResultList();
    } finally {
        em.close();
    }
}




}