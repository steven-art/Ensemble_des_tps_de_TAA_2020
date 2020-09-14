package fr.istic.m2.steven.taa.tp.Tp1;

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
		//List<Card> CardEnCour = new ArrayList();
		//List<Card> CardEnAttente = new ArrayList();
		//List<Card> CardEnTermine = new ArrayList();
		
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
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "KanbanTerminerId")
	public Collection<Card> getCardEnAttente() {
		return CardEnAttente;
	}
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "KanbanenattenteId")
	public Collection<Card> getCardTermine() {
		return CardTermine;
	}
	
}
