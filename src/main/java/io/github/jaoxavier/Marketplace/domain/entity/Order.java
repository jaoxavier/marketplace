package io.github.jaoxavier.Marketplace.domain.entity;

import javax.persistence.*;

@Entity
@Table
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
    private Double total_value;
    private String cupom;
    private String payment_method;


}
