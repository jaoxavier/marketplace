package io.github.jaoxavier.Marketplace.rest.controller;

import io.github.jaoxavier.Marketplace.domain.entity.Cart;
import io.github.jaoxavier.Marketplace.domain.entity.Cart;
import io.github.jaoxavier.Marketplace.domain.repository.CartRepository;
import io.github.jaoxavier.Marketplace.domain.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/carts")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @PostMapping
    private Cart create(@RequestBody Cart cart){
        return cartRepository.save(cart);
    }

    @GetMapping("/{id}")
    private Cart getCartById(@PathVariable Integer id){
        return cartRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Cart not found")
        );
    }

    @PatchMapping
    private Cart editCart(@RequestBody Cart cart){
        return cartRepository.save(cart);
    }

    @DeleteMapping("/{id}")
    private void deleteCart(@PathVariable Integer id){
        cartRepository.deleteById(id);
    }
}
