package dao;

import com.StudentEO14;

import javax.persistence.*;

/**
 * @author 冰
 */
public class StudentDAO14 {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("stuPU");

    public static void save(StudentEO14 stu) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(stu);
        em.getTransaction().commit();
        em.close();
    }

    public static StudentEO14 findById(Integer id) {
        EntityManager em = emf.createEntityManager();
        StudentEO14 instance = em.find(StudentEO14.class, id);
        em.close();
        return instance;
    }

    public static void update(StudentEO14 stu) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(stu);
        em.getTransaction().commit();
        em.close();
    }

    public static void delete(StudentEO14 stu) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(stu));
        em.getTransaction().commit();
        em.close();
    }
}
