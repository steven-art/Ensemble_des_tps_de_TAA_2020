package fr.istic.m2.steven.taa.tp.Tp2.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.istic.m2.steven.taa.tp.Tp2.Card;
import fr.istic.m2.steven.taa.tp.Tp2.DAOCards;
import fr.istic.m2.steven.taa.tp.Tp2.Tag;

@WebServlet(name = "cardservlet", urlPatterns={"/CardServlet"})
public class CardServlet extends HttpServlet{
	DAOCards cardDao;
	Tag tag;
	List<Card> listOfCard;
	public void init()throws ServletException {
		cardDao = new DAOCards();
		listOfCard = new ArrayList<>();
	}
	public String afficheCards(List<Card> listOfCard) {

		String nameCard="";
		for (int i=0; i<listOfCard.size(); i++) {

			nameCard= nameCard + "</br>"+listOfCard.get(i).getLibelle();
		}
		return nameCard;

	}
	//metode pour remplir une carte et la rentré dans une base de donnée
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		this.init();
		out.println("<HTML>\n<BODY>\n" +
				"<H1>Recapitulatif des informations</H1>\n" +
				"<UL>\n" +            
				" <LI>Libellé: "
				+ request.getParameter("libelle") + "\n" +
				" <LI>Date butoire: "
				+ request.getParameter("datebutoire") + "\n" +
				" <LI>Description: "
				+ request.getParameter("note") + "\n" +
				"</UL>\n" +                
				"</BODY></HTML>");
		Card c = new Card();
		c.setLibelle(request.getParameter("libelle"));
		c.setUrl(request.getParameter("datebutoire"));
		c.setNote(request.getParameter("note"));


		this.cardDao.saveCard(c);

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();{
			this.init();
			List<Card> allCard = cardDao.getAfficheCards();

		}
	}}
