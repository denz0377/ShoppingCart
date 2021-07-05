package com.shoppingcart.shoppingcartproject.Modelx;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @ManyToMany
    @JoinColumn(name = "User id")
    private Set<User> user;


    @ManyToMany
    @JoinColumn(name = "Product id")
    private Set<Product> product;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }
}
