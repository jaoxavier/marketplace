package io.github.jaoxavier.Marketplace.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    private String name;
    private String email;
    private String cnpj;

}
