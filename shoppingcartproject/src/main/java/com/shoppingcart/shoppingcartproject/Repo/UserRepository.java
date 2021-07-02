package com.shoppingcart.shoppingcartproject.Repo;

import com.shoppingcart.shoppingcartproject.Modelx.User;
import com.shoppingcart.shoppingcartproject.dto.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    public User findByEmail(String email);


    @Query("SELECT new com.shoppingcart.shoppingcartproject.dto.OrderResponse(u.firstName , p.productName) FROM User u JOIN u.product p")
    public List<OrderResponse> getJoinInformation();

}
