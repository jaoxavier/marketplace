package io.github.jaoxavier.Marketplace.domain.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    private List<Product> products;


}
