package sample.data.jpa.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class TableauKanban {

	
	
	private String nameTable;
	
	@OneToMany
	@JoinColumn(name = "enCoursId")
	private List<Card> CardEnCour;
	@OneToMany
	@JoinColumn(name = "enAttenteId")
	private List<Card> CardEnAttente;
	@OneToMany
	@JoinColumn(name = "termineId")
	private List<Card> CardTermine;
	
	public TableauKanban() {
		
	}
	public TableauKanban(String nameTable) {
		this.nameTable = nameTable;
		CardEnCour = new ArrayList();
		CardEnAttente = new ArrayList();
		CardTermine = new ArrayList();
		
	}
	
	@Id
	public String getNameTable() {
		return nameTable;
	}
	public void setNameTable(String nameTable) {
		this.nameTable = nameTable;
	}
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "KanbanEnCourId")
	public Collection<Card> getCardEnCour() {
		return CardEnCour;
	}
	public void setCardEnCour(Card c){
		CardEnCour.add(c);
	}
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "KanbanTerminerId")
	public Collection<Card> getCardEnAttente() {
		return CardEnAttente;
	}
	public void setCardEnAttente(Card c){
		CardEnAttente.add(c);
	}
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "KanbanenattenteId")
	public Collection<Card> getCardTermine() {
		return CardTermine;
	}
	public void setCardTermine(Card c){
		CardTermine.add(c);
	}
}
