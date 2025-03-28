package com.peceguini.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peceguini.course.entities.Product;
import com.peceguini.course.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
   private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
   public Product findById(Long  id) {
	   Optional<Product> product = repository.findById(id);
	   return product.get();
   }
}

