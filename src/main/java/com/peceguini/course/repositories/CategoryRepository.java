package com.peceguini.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.peceguini.course.entities.Category;

public interface  CategoryRepository extends JpaRepository<Category, Long> {


}
