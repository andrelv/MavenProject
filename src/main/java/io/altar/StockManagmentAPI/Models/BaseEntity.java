package io.altar.StockManagmentAPI.Models;
//Class that contain common attributes between Product and Shelf.

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Attributes:
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	// Get and Set:
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
