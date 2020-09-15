package fr.istic.m2.steven.taa.tp.Tp2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	private long idTag;
	private String title;
	private List<Card> cards;
	
	public Tag() {
		
	}
	
	public Tag(String title) {
		this.idTag = idTag;
		this.title =title;
		
		List<Card> cards = new ArrayList();
		
	}
	
	@ManyToMany(mappedBy = "tag",cascade = CascadeType.PERSIST)
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	@Id
	@GeneratedValue 
	public long getIdTag() {
		return idTag;
	}
	public void setIdTag(long idTag) {
		this.idTag = idTag;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
