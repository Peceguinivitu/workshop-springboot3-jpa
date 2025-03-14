package com.peceguini.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.peceguini.course.entites.Order;

public interface  OrderRepository extends JpaRepository<Order, Long> {


}
