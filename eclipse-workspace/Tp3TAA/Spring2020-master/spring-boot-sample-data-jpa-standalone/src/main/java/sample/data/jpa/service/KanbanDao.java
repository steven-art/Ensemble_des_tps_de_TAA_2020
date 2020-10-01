package sample.data.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sample.data.jpa.domain.Card;
import sample.data.jpa.domain.TableauKanban;


@Transactional
public interface KanbanDao extends JpaRepository<TableauKanban, String> {

	//public Card showAllCardEnCour();
	
	//public Card showAllCardEnAttente();
	
	//public Card showAllCardTermine();
}
