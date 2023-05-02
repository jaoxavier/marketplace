package io.github.jaoxavier.Marketplace.rest.controller;

import io.github.jaoxavier.Marketplace.domain.entity.Product;
import io.github.jaoxavier.Marketplace.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    private Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/{id}")
    private Product getProductById(@PathVariable Integer id){
        return productRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Product not found")
        );
    }

    @PatchMapping
    private Product editProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    private void deleteProject(@PathVariable Integer id){
        productRepository.deleteById(id);
    }
}
