package io.github.jaoxavier.Marketplace.rest.controller;

import io.github.jaoxavier.Marketplace.domain.entity.Order;
import io.github.jaoxavier.Marketplace.domain.entity.Product;
import io.github.jaoxavier.Marketplace.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    private Order create(@RequestBody Order order){
        return orderRepository.save(order);
    }

    @GetMapping("/{id}")
    private Order getOrderById(@PathVariable Integer id){
        return orderRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Order not found")
        );
    }

    @PatchMapping
    private Order editOrder(@RequestBody Order order){
        return orderRepository.save(order);
    }

    @DeleteMapping("/{id}")
    private void deleteOrder(@PathVariable Integer id){
        orderRepository.deleteById(id);
    }
}
