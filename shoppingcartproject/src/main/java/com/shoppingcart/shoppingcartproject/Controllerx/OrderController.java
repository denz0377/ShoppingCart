package com.shoppingcart.shoppingcartproject.Controllerx;


import com.shoppingcart.shoppingcartproject.Modelx.User;
import com.shoppingcart.shoppingcartproject.Repo.ProductRepository;
import com.shoppingcart.shoppingcartproject.Repo.UserRepository;
import com.shoppingcart.shoppingcartproject.dto.OrderRequest;
import com.shoppingcart.shoppingcartproject.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public User placeOrder(@RequestBody OrderRequest request){
        return userRepository.save(request.getUser());
    }

    @GetMapping("/findAllOrders")
    public List<User> findAllOrders(){
        return userRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return userRepository.getJoinInformation();
    }
}