package com.mustafa.order_ms.controller;

import com.mustafa.order_ms.dto.OrderDTO;
import com.mustafa.order_ms.entity.Order;
import com.mustafa.order_ms.exception.OrderRuntimeException;
import com.mustafa.order_ms.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        if (id == null || id <= 0) {
            throw new OrderRuntimeException("Geçerli bir değer sağlanılmadı.");
        }
        return orderService.getOrderById(id);
    }

    @PostMapping
    public Order createOrder(@RequestBody OrderDTO orderDTO) {
        Order order = new Order();
        order.setProductId(orderDTO.getProductId());
        order.setQuantity(orderDTO.getQuantity());

        return orderService.addOrder(order);
    }
}
