package com.nep.nws04.repository;

import org.springframework.data.repository.CrudRepository;

import com.nep.nws04.model.Product;

public interface ProductRepository 
	extends CrudRepository<Product, Long>{

}
