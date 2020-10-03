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
	@RequestMapping("/card/get-by-libelle/{libelle}")
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
	/**
	 * GET /create  --> Create a new card and save it in the database.
	 */
	@RequestMapping("/card/create")
	@ResponseBody
	public String create(String libelle,String url, String note) {
		String cardId = "";
		try {
			Card card = new Card(libelle,url,note);
			cardDao.save(card);
			cardId = String.valueOf(card.getIdCard());
		}
		catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "User succesfully created with id = " + cardId;
	}

	/**
	 * GET /delete  --> Delete the Card having the passed id.
	 */
	@RequestMapping("/card/delete")
	@ResponseBody
	public String delete(long idCard) {
		try {
			Card card = new Card(idCard);
			cardDao.delete(card);
		}
		catch (Exception ex) {
			return "Error deleting the user:" + ex.toString();
		}
		return "User succesfully deleted!";
	}


	// Private fields

	@Autowired
	private CardDao cardDao;
}
