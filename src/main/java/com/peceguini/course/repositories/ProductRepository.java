package com.peceguini.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.peceguini.course.entities.Product;

public interface  ProductRepository extends JpaRepository<Product, Long> {


}
