package dao;

import com.ContactsEO14;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author 冰
 */
public class ContactsDAO14 {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("stuPU");

    public static void save(ContactsEO14 cont) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cont);
        em.getTransaction().commit();
        em.close();
    }

    public static ContactsEO14 findById(Integer id) {
        EntityManager em = emf.createEntityManager();
        ContactsEO14 instance = em.find(ContactsEO14.class, id);
        em.close();
        return instance;
    }

    public static void update(ContactsEO14 stu) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(stu);
        em.getTransaction().commit();
        em.close();
    }

    public static void delete(ContactsEO14 stu) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(stu));
        em.getTransaction().commit();
        em.close();
    }
}
