package com.ttj.usermgmt.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ttj.usermgmt.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
