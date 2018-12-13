package io.altar.StockManagmentAPI.Business;

import io.altar.StockManagmentAPI.Models.BaseEntity;

public class ProductDto extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int discountPrice;
	private int iva;
	private double pvp;

	public ProductDto() {
	}

	public ProductDto(long id, int discountPrice, int iva, double pvp) {
		this.setId(id);
		this.discountPrice = discountPrice;
		this.iva = iva;
		this.pvp = pvp;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

}
