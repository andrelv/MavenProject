package io.altar.business;

import java.util.Collection;

import io.altar.model.Product;
import io.altar.repository.ProductRepository;

public class ProductBusiness {

	private static final ProductRepository productRepository1= ProductRepository.getInstance();
	
	
	public static void createProduct(Product product1) {
		
		productRepository1.saveId(product1);
	}

	public static Collection<Product> consultAllProduct() {
		
		return productRepository1.consultAll();
	}
	
	
	public static Product removeProduct(Long id) {
		return productRepository1.removeById(id);
		
	}
	
	public static Product consultByIdProduct(Long id) {
		return productRepository1.consultById(id);
	}
	
	
	public static void editProduct(Product product1) {

		productRepository1.editById(product1);

	}
}
