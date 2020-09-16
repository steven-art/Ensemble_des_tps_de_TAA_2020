package fr.istic.taa.jaxrs.dao.generic;





import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.istic.taa.jaxrs.domain.Card;

public class DAOCards {

	private EntityManager manager;
	

	public DAOCards() {
		this.manager = EntityManagerHelper.getEntityManager();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			DAOCards p =new DAOCards();
			p.createCard();
			p.listCard();   
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		manager.close();
		factory.close();
	} 
	
	public List<Card> getAfficheCards() {
        List<Card> allCards = manager.createQuery("Select c From Card c", Card.class).getResultList();
       
        return allCards;
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
		System.out.println("num of cards:" + resListCard.size());
		for (Card next : resListCard) {
			System.out.println("next Card: " + next);
		}

	}
	public void saveCard(Card c) {
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(c);
		tx.commit();
	}


	public Card findCardById(Long id) {
		// TODO Auto-generated method stub
		return manager.find(Card.class, id);
		
	}
	
	 

}
