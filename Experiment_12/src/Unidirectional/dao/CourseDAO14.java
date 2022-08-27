package Unidirectional.dao;

import Unidirectional.entity.CourseEO14;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author 冰
 */
public class CourseDAO14 {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("studyPU");

    public static void save(CourseEO14 course) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        em.close();
    }

    public static CourseEO14 findCourseById(Integer id) {
        EntityManager em = emf.createEntityManager();
        CourseEO14 instance = em.find(CourseEO14.class, id);
        em.close();
        return instance;
    }
}
