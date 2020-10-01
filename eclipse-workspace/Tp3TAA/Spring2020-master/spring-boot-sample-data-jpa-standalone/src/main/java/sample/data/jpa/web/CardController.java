package sample.data.jpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sample.data.jpa.domain.Card;
import sample.data.jpa.domain.User;
import sample.data.jpa.service.CardDao;


@Controller
public class CardController {

	/**
	   * GET /get-by-libelle  --> Return the card with a libelle of the card
	   * 
	   */
	  @RequestMapping("/get-by-libelle/{libelle}")
	  @ResponseBody
	  public String getBylibelle(@PathVariable("libelle") String libelle) {
	    String cardId = "";
	    try {
	      Card card = cardDao.findByLibelle(libelle);
	      cardId = String.valueOf(card.getIdCard());
	    }
	    catch (Exception ex) {
	      return "card not found";
	    }
	    return "The card libelle is: " + cardId;
	  }
	  
	
	
	// Private fields

	  @Autowired
	  private CardDao cardDao;
}
