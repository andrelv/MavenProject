package io.altar.StockManagmentAPI.Models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

// Class Model Shelf
@Entity
@NamedQueries({ @NamedQuery(name = Shelf.GET_ALL_SHELFS_QUERY_NAME, query = "SELECT s FROM Shelf s"),
	@NamedQuery(name = Shelf.DELETE_ALL_SHELFS_QUERY_NAME, query = "DELETE FROM Shelf") })
public class Shelf extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String GET_ALL_SHELFS_QUERY_NAME = "getAllShelfs";
	public static final String DELETE_ALL_SHELFS_QUERY_NAME = "deleteAllShelfs";
	// Fields:
	@ManyToOne(cascade = CascadeType.ALL)
	private Product product;

	private int capacity;
	private double price;

	// Constructor:
	public Shelf() {
	}

	public Shelf(int capacity, double price) {
		this.capacity = capacity;
		this.price = price;
	}

	public Shelf(Product product, int capacity, double price) {
		this.product = product;
		this.capacity = capacity;
		this.price = price;
	}

	// Getters and Setters
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	// -------------------------------------------------------
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	// -------------------------------------------------------
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}