package io.altar.business;

import java.util.Collection;

import javax.transaction.Transactional;

import io.altar.model.Shelf;
import io.altar.repository.ShelfRepository;

public class ShelfBusiness {
private static final ShelfRepository shelfRepository1 = ShelfRepository.getInstance();
	
	
	@Transactional
	public static void createShelf(Shelf shelf1) {
		
		shelfRepository1.saveId(shelf1);
	}
	
//	public static Collection <Shelf> consultAllShelf(){
//		
//		return shelfRepository1.consultAll();
//		
//	}
	
	@Transactional
	public static void removeShelf (Long id) {
	 shelfRepository1.removeById(id);
}
	
//	public static Shelf consultByIdShelf(Long id){
//		return shelfRepository1.consultById(id);
//	}
	
	@Transactional
	public static void editShelf(Shelf shelf1) {
		shelfRepository1.editById(shelf1);
		
	}
	
}