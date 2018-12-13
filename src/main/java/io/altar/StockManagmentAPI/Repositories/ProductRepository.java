package io.altar.StockManagmentAPI.Repositories;

import io.altar.StockManagmentAPI.Models.Product;

//Class Product Repository that Extends to DataBase - Singleton
public class ProductRepository extends EntityRepository<Product> {

	// Instance:
	private static final ProductRepository INSTANCE = new ProductRepository();

	// Constructor:
	private ProductRepository() {
	}

	// Get:
	public static ProductRepository getInstance() {
		return INSTANCE;
	}

	protected Class<Product> getEntityClass() {
		return Product.class;
	}

	protected String getAllEntityQueryName() {
		return Product.GET_ALL_PRODUCTS_QUERY_NAME;
	}
	
	protected String deleteAllEntityQueryName() {
		return Product.DELETE_ALL_PRODUCTS_QUERY_NAME;
	}
}
