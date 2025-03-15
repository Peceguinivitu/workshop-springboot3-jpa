package com.peceguini.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.peceguini.course.entities.Order;

public interface  OrderRepository extends JpaRepository<Order, Long> {


}
