package fr.istic.m2.steven.taa.tp.Tp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	
	private long id;
	
	private String firstName;
	private String lastName;
	
	private List<Card> cards;
	

	public User() {
		
	}
	public User(String firstname,String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
		
		List cards =new ArrayList();
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST)
	public List<Card> getCards() {
		return cards;
	}
	
	public void setCards(Card c) {
		cards.add(c);
	}
}
