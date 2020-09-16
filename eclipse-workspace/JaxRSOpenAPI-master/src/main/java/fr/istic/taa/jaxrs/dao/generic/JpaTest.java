package fr.istic.taa.jaxrs.dao.generic;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.istic.taa.jaxrs.domain.Card;
import fr.istic.taa.jaxrs.domain.User;

public class JpaTest {
	
	private EntityManager manager;

    public JpaTest(EntityManager manager) {
        this.manager = manager;
    }

	/**
     * @param args
     */
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("dev");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        try {
            JpaTest p =new JpaTest(manager);
            p.createUser();
            p.addCardToUser();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();
        
        manager.close();
        factory.close();
    } 
    private void createUser() {
        int numOfUser = manager.createQuery("Select u From User u", User.class).getResultList().size();
        if (numOfUser == 0) {
            
        	Card cards = new Card();
            manager.persist(cards);

           User u = new User("Jakab", "Gipsz");
          manager.persist(u);
           

        }
    }

    private void listUser() {
        List<User> resultList = manager.createQuery("Select u From User u", User.class).getResultList();
        System.out.println("num of employess:" + resultList.size());
        for (User next : resultList) {
            System.out.println("next employee: " + next);
        }

    }
    private void addCardToUser() {
    	

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
    	
    	try {
            JpaTest p = new JpaTest(manager);
            p.createUser();
        
        tx.commit();
        
        EntityTransaction tx2 = manager.getTransaction();
        tx2.begin();
        
        
        	  Card card = new Card();
              manager.persist(card);

              manager.persist(new Card("url", "voila la description de cette carte"));
       
        tx2.commit();
        
        EntityTransaction tx3 = manager.getTransaction();
        tx3.begin();
        
      
        	  card.getUser().setCards(card);
        	  tx3.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
   }
