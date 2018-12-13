package io.altar.StockManagmentAPI.Models;

import java.util.ArrayList;

//Imports:

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

// Class Model Product
@Entity
@NamedQueries({ @NamedQuery(name = Product.GET_ALL_PRODUCTS_QUERY_NAME, query = "SELECT p FROM Product p"),
	@NamedQuery(name = Product.DELETE_ALL_PRODUCTS_QUERY_NAME, query = "DELETE FROM Product") })
public class Product extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_PRODUCTS_QUERY_NAME = "getAllProducts";
	public static final String DELETE_ALL_PRODUCTS_QUERY_NAME = "deleteAllProducts";
	// Fields:
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	private List<Shelf> listShelfs;

	private int discountPrice;
	private int iva;
	private double pvp;

	// Constructor:

	public Product() {
	}

	public Product(int discountPrice, int iva, double pvp) {
		this.listShelfs = new ArrayList<Shelf>();
		this.discountPrice = discountPrice;
		this.iva = iva;
		this.pvp = pvp;
	}

	public Product(List<Shelf> listShelfs, int discountPrice, int iva, double pvp) {
		this.listShelfs = listShelfs;
		this.discountPrice = discountPrice;
		this.iva = iva;
		this.pvp = pvp;
	}

	// Getters and Setters:
	public List<Shelf> getListShelfs() {
		return listShelfs;
	}

	public void setListShelfs(List<Shelf> listShelfs) {
		this.listShelfs = listShelfs;
	}

	// -------------------------------------------------------
	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	// -------------------------------------------------------
	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	// -------------------------------------------------------
	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	// -------------------------------------------------------
}