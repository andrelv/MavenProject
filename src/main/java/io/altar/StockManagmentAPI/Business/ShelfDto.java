package io.altar.StockManagmentAPI.Business;

import io.altar.StockManagmentAPI.Models.BaseEntity;
import io.altar.StockManagmentAPI.Models.Product;

public class ShelfDto extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Product product;
	private int capacity;
	private double price;

	public ShelfDto() {
	}

	public ShelfDto(long id, int capacity, double price) {
		this.setId(id);
		this.capacity = capacity;
		this.price = price;
	}

	public ShelfDto(long id, Product product, int capacity, double price) {
		this.setId(id);
		this.capacity = capacity;
		this.product = product;
		this.price = price;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
