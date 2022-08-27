package Bidirectional.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * @author 冰
 */
public class TestSQL {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("study2PU");

    public static void excuteSQL() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createNativeQuery("select * from study");
        List<Object> courseList = query.getResultList();
        System.out.println(courseList);
        em.close();
    }

    public static void excuteUpdate() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createNativeQuery("update study set score=95 where student_id=2 and course_id=3");
        query.executeUpdate();
        //List<Object> courseList = query.getResultList();
        //System.out.println(courseList);
        em.close();
    }

    public static void main(String[] args) {
        //excuteSQL();
        excuteUpdate();
    }
}
