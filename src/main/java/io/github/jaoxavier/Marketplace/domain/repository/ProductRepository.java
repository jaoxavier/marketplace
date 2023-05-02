package io.github.jaoxavier.Marketplace.domain.repository;

import io.github.jaoxavier.Marketplace.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
