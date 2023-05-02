package io.github.jaoxavier.Marketplace.rest.controller;

import io.github.jaoxavier.Marketplace.domain.entity.Address;
import io.github.jaoxavier.Marketplace.domain.entity.Address;
import io.github.jaoxavier.Marketplace.domain.repository.AddressRepository;
import io.github.jaoxavier.Marketplace.domain.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping
    private Address create(@RequestBody Address address){
        return addressRepository.save(address);
    }

    @GetMapping("/{id}")
    private Address getAddressById(@PathVariable Integer id){
        return addressRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Address not found")
        );
    }

    @PatchMapping
    private Address editAddress(@RequestBody Address address){
        return addressRepository.save(address);
    }

    @DeleteMapping("/{id}")
    private void deleteAddress(@PathVariable Integer id){
        addressRepository.deleteById(id);
    }
}
