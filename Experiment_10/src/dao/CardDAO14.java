package dao;

import com.CardEO14;

import javax.persistence.*;
import javax.persistence.Persistence;
import java.util.List;

/**
 * @author 冰
 */
public class CardDAO14 {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("cardPU");

    public static void save(CardEO14 card) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(card);
        em.getTransaction().commit();
        em.close();
    }

    public static List<CardEO14> findAllCards() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("select c from CardEO14 c");
        List<CardEO14> cardList = query.getResultList();
        em.close();
        return cardList;
    }

    public static CardEO14 findById(Integer id) {
        EntityManager em = emf.createEntityManager();
        CardEO14 instance = em.find(CardEO14.class, id);
        em.close();
        return instance;
    }

    public static void update(CardEO14 card) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(card);
        em.getTransaction().commit();
        em.close();
    }

    public static void delete(CardEO14 card) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(card));
        em.getTransaction().commit();
        em.close();
    }
}
