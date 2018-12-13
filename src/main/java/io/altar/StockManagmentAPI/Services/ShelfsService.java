package io.altar.StockManagmentAPI.Services;

import java.util.List;

import javax.inject.Inject;
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

import io.altar.StockManagmentAPI.Business.ShelfBusiness;
import io.altar.StockManagmentAPI.Business.ShelfDto;
import io.altar.StockManagmentAPI.Models.Shelf;

@Path("/shelf")
public class ShelfsService {

	@Inject
	ShelfBusiness shelfBusiness;

	@POST
	@Path("/criar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ShelfDto addShelf(Shelf shelf) {
		return shelfBusiness.saveShelf(shelf);
	}

	@PUT
	@Path("/editar/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ShelfDto updateShelf(@PathParam("id")  long id, Shelf shelf) {
		return shelfBusiness.replaceShelf(shelf);
	}

	@DELETE
	@Path("/remove/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removeShelfById(@PathParam("id") long id) {
		shelfBusiness.removeShelf(id);
		return Response.ok().build();
	}

	 @GET
	 @Path("/getAll")
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<Shelf> getAllShelfs(){
	 return shelfBusiness.getAllShelfs();
	 }
	 
	 @GET
		@Path("/getById/{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public Shelf getShelfById(@PathParam("id") long id) {
			return shelfBusiness.getShelfById(id);
		}
	
	 @DELETE
		@Path("/deleteAll")
		@Produces(MediaType.APPLICATION_JSON)
		public int removeAllShelfs() {		
			return shelfBusiness.removeAllShelfs();
		}
	 
}
