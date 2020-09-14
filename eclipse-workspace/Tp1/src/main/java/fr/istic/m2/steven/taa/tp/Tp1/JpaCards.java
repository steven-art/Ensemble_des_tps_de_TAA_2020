package fr.istic.m2.steven.taa.tp.Tp1;





import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaCards {
	
	private EntityManager manager;
	
	public JpaCards(EntityManager manager) {
		this.manager = manager;
	}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	EntityManagerFactory factory = Persistence
            .createEntityManagerFactory("dev");
    EntityManager manager = factory.createEntityManager();

    EntityTransaction tx = manager.getTransaction();
    tx.begin();
    try {
        JpaCards p =new JpaCards(manager);
        p.createCard();
        p.listCard();   
    } catch (Exception e) {
        e.printStackTrace();
    }
    tx.commit();
    
    manager.close();
    factory.close();
} 
	
private void createCard() {
	int numOfCard = manager.createQuery("Select c From Card c", Card.class).getResultList().size();
    if (numOfCard == 0) {
        Card card = new Card();
        manager.persist(card);

        manager.persist(new Card("url", "voila la description de cette carte"));
        manager.persist(new Card("url2", "voila la description de cette carte"));

    }
    
}

private void listCard() {
	List<Card> resListCard = manager.createQuery("Select c From Card c", Card.class).getResultList();
    System.out.println("num of employess:" + resListCard.size());
    for (Card next : resListCard) {
        System.out.println("next Card: " + next);
    }

}



}
