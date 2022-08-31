package com.ttj.usermgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttj.usermgmt.model.Product;
import com.ttj.usermgmt.model.ProductDTO;
import com.ttj.usermgmt.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	// Get All Product:
	@GetMapping("/all")
	public List<Product> findAllProducts(){
		return productService.getAllProducts();
	}
	
	// Get Product By Id:
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id") Integer id) {
		return productService.getProductById(id);
	}
	
	// Create Product:
	@PostMapping("/new")
	public ResponseEntity<?> createProduct(@RequestBody ProductDTO ProductDTO) {
		productService.saveProduct(ProductDTO);
		return new ResponseEntity<>(ProductDTO, HttpStatus.CREATED);
	}
	
	// Update Product:
	@PutMapping("/edit")
	public ResponseEntity<?> updateProduct(@RequestBody ProductDTO ProductDTO) {
		productService.saveProduct(ProductDTO);
		return new ResponseEntity<>(ProductDTO, HttpStatus.CREATED);
	}
	
	// Delete Product:
	@GetMapping("/del/{id}")
	public String deleteProductById(@PathVariable("id") Integer id) {
		productService.deleteById(id);
		return "Delete product has been success!";
	}
	
}
