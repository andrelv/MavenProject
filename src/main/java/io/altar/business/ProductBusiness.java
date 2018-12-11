package io.altar.business;

import java.util.Collection;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.model.Product;
import io.altar.repository.ProductRepository;

public class ProductBusiness {

	@Inject
	private static ProductRepository productRepository1;
	
	@Transactional
	public static void createProduct(Product product1) {
		
		productRepository1.saveId(product1);
	}

//	public static Collection<Product> consultAllProduct() {
//		
//		return productRepository1.consultAll();
//	}
	
	@Transactional
	public static void removeProduct(Long id) {
		productRepository1.removeById(id);
	}
	
//	public static Product consultByIdProduct(Long id) {
//		return productRepository1.consultById(id);
//	}
	
	@Transactional
	public static void editProduct(Product product1) {

		productRepository1.editById(product1);

	}
}
