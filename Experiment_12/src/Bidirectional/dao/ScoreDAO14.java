package Bidirectional.dao;

import Bidirectional.entity.CourseEO14;
import Bidirectional.entity.ScoreEO14;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * @author 冰
 */
public class ScoreDAO14 {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("study2PU");

    public static void save(ScoreEO14 score) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(score);
        em.getTransaction().commit();
        em.close();
    }

    public static ScoreEO14 findCourseById(Integer id) {
        EntityManager em = emf.createEntityManager();
        ScoreEO14 instance = em.find(ScoreEO14.class, id);
        em.close();
        return instance;
    }

    public static List<CourseEO14> findAllCourses() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("select sc from ScoreEO14 sc");
        List<CourseEO14> courseList = query.getResultList();
        em.close();
        return courseList;
    }
}
