package io.altar.StockManagmentAPI.Repositories;

import io.altar.StockManagmentAPI.Models.Shelf;

//Class Shelf Repository that Extends to DataBase - Singleton
public class ShelfRepository extends EntityRepository<Shelf> {

	// Instance:
	private final static ShelfRepository INSTANCE = new ShelfRepository();

	// Constructor:
	private ShelfRepository() {
	}

	// Get:
	public static ShelfRepository getInstance() {
		return INSTANCE;
	}

	protected Class<Shelf> getEntityClass() {
		return Shelf.class;
	}

	protected String getAllEntityQueryName() {
		return Shelf.GET_ALL_SHELFS_QUERY_NAME;
	}
	
	protected String deleteAllEntityQueryName() {
		return Shelf.DELETE_ALL_SHELFS_QUERY_NAME;
	}
}
