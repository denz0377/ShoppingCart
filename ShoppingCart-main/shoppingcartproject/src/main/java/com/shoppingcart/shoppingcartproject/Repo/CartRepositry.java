package com.shoppingcart.shoppingcartproject.Repo;

import com.shoppingcart.shoppingcartproject.Modelx.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepositry extends JpaRepository<Cart, Long> {

}
