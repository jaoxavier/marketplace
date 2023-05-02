package io.github.jaoxavier.Marketplace.domain.repository;

import io.github.jaoxavier.Marketplace.domain.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
}
