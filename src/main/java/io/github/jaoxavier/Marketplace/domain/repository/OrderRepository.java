package io.github.jaoxavier.Marketplace.domain.repository;

import io.github.jaoxavier.Marketplace.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
