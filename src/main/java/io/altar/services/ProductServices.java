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

import io.altar.business.ProductBusiness;
import io.altar.model.Product;

@Path("/product")
public class ProductServices {
	

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

		// menu criar produto	
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Product newProduct(Product product1) {

			ProductBusiness.createProduct(product1);

			return product1;
		}


		// editar produto	
		@PUT
		@Path ("/editar{id}")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Product editProduct(@PathParam("id") long id, Product product1) {

			product1= ProductBusiness.consultByIdProduct(id);

			ProductBusiness.editProduct(product1);

			return product1;
		}


		//consultar produto
		@GET
		@Path("/consultar{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public Product consultProduct(@PathParam("id") long id, Product product1) {

			product1 = ProductBusiness.consultByIdProduct(id);
			return product1;

		}
		
		//remover produto
		@DELETE
		@Path("/remove/{id}")
		@Produces(MediaType.APPLICATION_JSON)	
		public Response removerProduct(@PathParam("id") long id, Product product1) {

			ProductBusiness.removeProduct(id);
			return Response.status(200).build();

		}
		
		@GET
		@Path("/getall")
		@Produces(MediaType.APPLICATION_JSON)
		public static Collection<Product> consultAllProduct() {
			
			return ProductBusiness.consultAllProduct();
		}
			
	}
