package com.ttj.usermgmt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttj.usermgmt.model.Product;
import com.ttj.usermgmt.model.ProductDTO;
import com.ttj.usermgmt.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	// Read All Data:
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}
	
	// Read Data By ID:
	public Product getProductById(Integer id) {
		return productRepo.findById(id).get();
	}
	
	// Create or Update (when id does exist):
	public Product saveProduct(ProductDTO productDTO) {
		
		Product newProduct = new Product();
		
		newProduct.setId(productDTO.getId());
		newProduct.setName(productDTO.getName());
		newProduct.setPrice(productDTO.getPrice());
		
		return productRepo.save(newProduct);
	}
	
	
	//Delete:
	public void deleteById(Integer id) {
		productRepo.deleteById(id);
	}
	
	
	
}
