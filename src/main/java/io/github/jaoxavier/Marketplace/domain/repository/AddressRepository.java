package io.github.jaoxavier.Marketplace.domain.repository;

import io.github.jaoxavier.Marketplace.domain.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
