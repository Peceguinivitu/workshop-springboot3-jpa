package com.peceguini.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.peceguini.course.entities.OrderItem;
import com.peceguini.course.entities.pk.OrderitemPK;

public interface  OrderItemRepository extends JpaRepository<OrderItem, OrderitemPK> {


}
