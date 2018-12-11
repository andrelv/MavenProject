package io.altar.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class Shelf extends Entity_ {
	
	
	private static final long serialVersionUID = 1L;
	private int capacidade;
	
	//@ManyToOne(cascade = CascadeType.ALL)
	private long produtoAlberga;
	private double precoAluguer;

	public Shelf() {
	}

	public Shelf(int capacidade, long produtoAlberga, double precoAluguer) {
		this.capacidade = capacidade;
		this.produtoAlberga = produtoAlberga;
		this.precoAluguer = precoAluguer;
	}

	
	public int getCapacidade() {
		return capacidade;
	}

	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	
	public long getProdutoAlberga() {
		return produtoAlberga;
	}

	
	public void setProdutoAlberga(long produtoAlberga) {
		this.produtoAlberga = produtoAlberga;
	}

	
	public double getPrecoAluguer() {
		return precoAluguer;
	}

	
	public void setPrecoAluguer(double precoAluguer) {
		this.precoAluguer = precoAluguer;
	}

	@Override
	public String toString() {
		return "Shelf id:" + this.getId() + " [capacidade:" + capacidade + ", Id do produto que Alberga: nenhum,"
				+ " preco do Aluguer:" + precoAluguer + "]";
	}

}
