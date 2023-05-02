package io.github.jaoxavier.Marketplace.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    private String name;
    private Double price;
    private LocalDate valid;
    private String type;
    private String barcode;
}
