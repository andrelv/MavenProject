package io.altar.services;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import io.altar.business.ShelfBusiness;
import io.altar.model.Shelf;

@Path("/shelf")
public class ShelfServices {

	@GET
	@Path("health")
	@Produces(MediaType.TEXT_PLAIN)
	public String health() {
		return "Api is working";
	}

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String health2() {
		return "Api is working";
	}

	// menu criar shelf
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Shelf newShef(Shelf shelf1) {

		ShelfBusiness.createShelf(shelf1);
		return shelf1;
	}

	// editar shelf
	@PUT
	@Path("/editar{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Shelf editShelf(@PathParam("id") long id, Shelf shelf1) {

		shelf1 = ShelfBusiness.consultByIdShelf(id);
		ShelfBusiness.editShelf(shelf1);
		return shelf1;
	}

	// menu consultar shelf
	@GET
	@Path("consultar/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public static Shelf consultShelf(@PathParam("id") long id, Shelf shelf1) {
		shelf1 = ShelfBusiness.consultByIdShelf(id);
		return shelf1;
	}

	// remover shelf
	@DELETE
	@Path("/remove/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public static Response removeShelf(@PathParam("id") long id) {
		ShelfBusiness.removeShelf(id);
		return Response.ok().build();
	}

	// get all
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)

	public static Collection<Shelf> consultAllShelf() {
		return ShelfBusiness.consultAllShelf();
	}
}
