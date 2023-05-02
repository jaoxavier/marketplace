package io.github.jaoxavier.Marketplace.rest.controller;

import io.github.jaoxavier.Marketplace.domain.entity.Store;
import io.github.jaoxavier.Marketplace.domain.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/stores")
public class StoreController {

    @Autowired
    private StoreRepository storeRepository;

    @PostMapping
    public Store create(@RequestBody Store store){
        return storeRepository.save(store);
    }

    @GetMapping("/{id}")
    public Store getStoreById(@PathVariable Integer id){
        return storeRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Store not found")
        );
    }

    @PatchMapping
    public Store editStore(@RequestBody Store store){
        return storeRepository.save(store);
    }

    @DeleteMapping("/{id}")
    public void deleteStoreById(@PathVariable Integer id){
        storeRepository.deleteById(id);
    }
}
