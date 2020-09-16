package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.Card;
import fr.istic.taa.jaxrs.domain.Pet;
import fr.istic.taa.jaxrs.domain.TableauKanban;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/TableauKanban")
@Produces({"application/json","application/xml"})
public class KanbanRessource {


	@GET
	@Path("/{nameTable}")
	public TableauKanban getKanbanByName(@PathParam("nameTable") String nameTable) {
		//retourne un tableau Kanban
		return new TableauKanban();

	}

//	@POST
//	@Consumes("application/json")
//	public Response addCardInKanban(@Parameter(description = "Card is add in kanban", required = true) Card card)) {
//		
//		return Response.ok().entity("SUCCESS").build();
//	}

}
