package Unidirectional.dao;

import Unidirectional.entity.StudentEO14;

import javax.persistence.*;
import java.util.List;

/**
 * @author 冰
 */
public class StudentDAO14 {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("studyPU");

    public static void save(StudentEO14 stu) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(stu);
        em.getTransaction().commit();
        em.close();
    }

    public static StudentEO14 findStudentById(Integer id) {
        EntityManager em = emf.createEntityManager();
        StudentEO14 instance = em.find(StudentEO14.class, id);
        em.close();
        return instance;
    }
    public static List<StudentEO14> findAllStudents() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("select s from StudentEO14 s");
        List<StudentEO14> studentList = query.getResultList();
        em.close();
        return studentList;
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
