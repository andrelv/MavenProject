package io.altar.StockManagmentAPI.Business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import javax.transaction.Transactional;

import io.altar.StockManagmentAPI.Models.Product;
import io.altar.StockManagmentAPI.Repositories.ProductRepository;

public class ProductBusiness {

	// Initializing;
	@Inject
	ProductRepository productRepository;

	// Save Product
	@Transactional
	public ProductDto saveProduct(Product saveProduct) {
		saveProduct = productRepository.save(saveProduct);
		ProductDto createProductDto = new ProductDto(saveProduct.getId(), saveProduct.getDiscountPrice(),
				saveProduct.getIva(), saveProduct.getPvp());
		return createProductDto;
	}

	@Transactional
	public ProductDto updateProduct(Product product) {
		product = productRepository.update(product);
		ProductDto createProductDto = new ProductDto(product.getId(), product.getDiscountPrice(), product.getIva(),
				product.getPvp());
		return createProductDto;
	}

	// Remove Product
	@Transactional
	public void removeProduct(long id) {
		productRepository.removeByID(id);
	}

	// Get All Products
	public List<ProductDto> getAllProducts() {

		Iterator<Product> getFromDB = productRepository.getAll().iterator();
		List<ProductDto> getAllProductsDto = new ArrayList<ProductDto>();

		while (getFromDB.hasNext()) {
			Product productAdd = getFromDB.next();
			ProductDto addProduct = new ProductDto(productAdd.getId(), productAdd.getDiscountPrice(),
					productAdd.getIva(), productAdd.getPvp());
			getAllProductsDto.add(addProduct);
		}
		return getAllProductsDto;
	}

	// Get Product by Id
	public ProductDto getProductById(long id) {
		Product product = productRepository.getById(id);
		ProductDto product1 = new ProductDto(product.getId(), product.getDiscountPrice(), product.getIva(),
				product.getPvp());
		return product1;
	}

	// Remove all Products
	@Transactional
	public int removeAllProducts() {
		return productRepository.removeAll();
	}
}
