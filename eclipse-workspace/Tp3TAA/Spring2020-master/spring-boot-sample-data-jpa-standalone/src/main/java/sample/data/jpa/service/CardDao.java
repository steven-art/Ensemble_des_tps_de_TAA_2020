package sample.data.jpa.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import sample.data.jpa.domain.Card;
import sample.data.jpa.domain.Tag;

@Transactional
public interface CardDao extends JpaRepository<Card, Long> {

	  /**
	   * This method will find an Card instance in the database by its libelle.
	   * Note that this method is not implemented and its working code will be
	   * automagically generated from its signature by Spring Data JPA.
	   */
	public Card findByName(String libelle);
	
	@Query("select c from Card as c where c.datebutoire = datebutoire")
	public Card findByDateButoire(Date datebutoire);
	/**
	 * This method will find all tag for the card with the libelle
	 * 
	 */
	@Query("select c from Card as c where c.tag ")
	public Card showAllTag(String libelle);
}