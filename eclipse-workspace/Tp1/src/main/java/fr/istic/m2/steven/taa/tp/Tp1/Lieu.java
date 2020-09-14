package fr.istic.m2.steven.taa.tp.Tp1;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lieu {
	
	
	private String nameLocation;
	private Collection<Card> Cards;
	
	@Id
	public String getNameLocation() {
		return nameLocation;
	} 

	public void setNameLocation(String nameLocation) {
		this.nameLocation = nameLocation;
	}
	
	@OneToMany(mappedBy = "lieu",cascade = CascadeType.PERSIST)
	public Collection<Card> getCards() {
		return Cards;
	}

	public void setCards(Collection<Card> cards) {
		Cards = cards;
	}

	
}
