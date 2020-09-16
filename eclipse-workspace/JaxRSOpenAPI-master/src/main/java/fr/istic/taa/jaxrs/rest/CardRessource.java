package fr.istic.taa.jaxrs.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.dao.generic.DAOCards;
import fr.istic.taa.jaxrs.domain.Card;
import fr.istic.taa.jaxrs.domain.Pet;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/Card")
@Produces({"application/json","application/xml"})
public class CardRessource {
	DAOCards daoCard = new DAOCards();

	@GET
	@Path("/{idCard}")
	public Card getCardById(@PathParam("idCard") Long idCard) {
		
		return this.daoCard.findCardById(idCard);

	}
	
	@GET
	@Path("/{idCard}")
	public List<Card> getListCard(@PathParam("idCard") Long idCard){
		
		return daoCard.getAfficheCards();
		
	}
	
	
	@POST
	@Consumes("application/json")
	public Response addCard(Card card) {
				daoCard.saveCard(card);
				return Response.ok().entity("SUCCESS").build();
			}
	
}
