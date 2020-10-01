package sample.data.jpa.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
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
	public Card findByLibelle(String libelle);
	
	@Query("select c from Card as c where c.datebutoire = :datebutoire")
	public Card findByDateButoire(@Param("datebutoire")  Date datebutoire);
	/**
	 * This method will find all tag for the card with the libelle
	 * 
	 */
	@Query("select c from Card as c where c.tag=:libelle")
	public Card showAllTag(@Param("libelle") String libelle);
}
