package io.github.jaoxavier.Marketplace.domain.entity;

import javax.persistence.*;

@Entity
@Table
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String cep;
    private String street;
    private String complement;
    private String number;
    private String district;
    private String city;
    private String UF;
}

