package io.altar.StockManagmentAPI.Business;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.StockManagmentAPI.Models.Shelf;
import io.altar.StockManagmentAPI.Repositories.ShelfRepository;

public class ShelfBusiness {

	// Initializing;
	@Inject
	ShelfRepository shelfRepository;

	// Save Shelf
	@Transactional
	public ShelfDto saveShelf(Shelf saveShelf) {
		saveShelf = shelfRepository.save(saveShelf);
		ShelfDto createShelf = new ShelfDto(saveShelf.getId(), saveShelf.getProduct(), saveShelf.getCapacity(),
				saveShelf.getPrice());
		return createShelf;
	}

	// Update:
	@Transactional
	public ShelfDto replaceShelf(Shelf shelf) {
		shelf = shelfRepository.update(shelf);
		ShelfDto createShelf = new ShelfDto(shelf.getId(), shelf.getProduct(), shelf.getCapacity(), shelf.getPrice());
		return createShelf;
	}

	// Remove Shelf
	@Transactional
	public void removeShelf(long id) {
		shelfRepository.removeByID(id);
	}

	// Get All Shelfs
	public List<Shelf> getAllShelfs() {
		return shelfRepository.getAll();
	}

	// Get Shelf by id
	public Shelf getShelfById(long id) {
		return shelfRepository.getById(id);
	}

	// Remove all Shelfs
	@Transactional
	public int removeAllShelfs() {
		return shelfRepository.removeAll();
	}
}
