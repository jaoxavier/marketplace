package io.github.jaoxavier.Marketplace.domain.repository;

import io.github.jaoxavier.Marketplace.domain.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
