package fr.istic.taa.jaxrs.dao.generic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.istic.taa.jaxrs.domain.Card;
import fr.istic.taa.jaxrs.domain.User;



public class UserDao {
	private EntityManager manager;
	
	public UserDao() {
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
			UserDao u = new UserDao();
			u.createUser();
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		manager.close();
		factory.close();
	}


	private void createUser() {
		// TODO Auto-generated method stub
		int numOfUser = manager.createQuery("Select u From User u", User.class).getResultList().size();
		if (numOfUser == 0) {
			User user = new User();
			manager.persist(user);

			manager.persist(new User("steven", "Tanguy"));
			manager.persist(new User("charle", "Darwin"));

		}
		
	}
	public User afficheUser(String firstName) {
		
		return manager.find(User.class, firstName);
		
	}
}

