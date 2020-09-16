package fr.istic.taa.jaxrs.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * Un libellé
La date butoire
un utilisateur à qui cette tâche est affectée
Le temps dont vous estimez avoir besoin en minutes
un ensemble de tags
un lieu
une url
il est également possible d'ajouter une note explicative.

 */
@Entity
public class Card {

	private Long idCard;
	private String libelle;
	
	private Date datebutoire;
	private Lieu lieu;
	private String url;
	private String note;
	
	private List<Tag> tag;
	
	private User user;
	
	public Card() {
		tag = new ArrayList<>();
	}
	public Card( String url, String note) {
		tag = new ArrayList<>();
		this.url = url;
		this.note = note;
	}

	
	 
	@ManyToOne
	public User getUser() {
		return user;
	}
	@ManyToMany(cascade = CascadeType.PERSIST)
	public List<Tag> getTag() {
		return tag;
	}

	
	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}
	public void addTag(Tag t) {
		tag.add(t);
		
	}

	public void setUser(User user) {
		this.user = user;
	}
	@ManyToOne
	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Id
	@GeneratedValue
	public Long getIdCard() {
		return idCard;
	}

	public void setIdCard(Long idCard) {
		this.idCard = idCard;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Temporal(TemporalType.DATE)
	public Date getDatebutoire() {
		return datebutoire;
	}

	public void setDatebutoire(Date datebutoire) {
		this.datebutoire = datebutoire;
	}

}
