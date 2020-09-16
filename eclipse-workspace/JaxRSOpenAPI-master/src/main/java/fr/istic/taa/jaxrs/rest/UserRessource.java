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
import fr.istic.taa.jaxrs.dao.generic.UserDao;
import fr.istic.taa.jaxrs.domain.Card;
import fr.istic.taa.jaxrs.domain.Pet;
import fr.istic.taa.jaxrs.domain.User;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/User")
@Produces({"application/json","application/xml"})
public class UserRessource {

	
	UserDao daoUser = new UserDao();

	@GET
	@Path("/{idCard}")
	public User getUserByfirstName(@PathParam("firstName") String firstName) {
		
		return this.daoUser.afficheUser(firstName);

	}
	
}
