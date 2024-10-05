package com.mustafa.order_ms.repository;

import com.mustafa.order_ms.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
