package Bidirectional.dao;

import Bidirectional.entity.CourseEO14;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * @author 冰
 */
public class CourseDAO14 {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("study2PU");

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

    public static List<CourseEO14> findAllCourses() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("select c from Bidirectional.entity.CourseEO14 c");
        List<CourseEO14> courseList = query.getResultList();
        em.close();
        return courseList;
    }
}
