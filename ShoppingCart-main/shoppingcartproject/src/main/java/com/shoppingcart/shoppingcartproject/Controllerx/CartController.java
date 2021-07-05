package com.shoppingcart.shoppingcartproject.Controllerx;


import com.shoppingcart.shoppingcartproject.Modelx.Cart;
import com.shoppingcart.shoppingcartproject.Modelx.Product;
import com.shoppingcart.shoppingcartproject.Modelx.User;
import com.shoppingcart.shoppingcartproject.Repo.CartRepositry;
import com.shoppingcart.shoppingcartproject.Repo.ProductRepository;
import com.shoppingcart.shoppingcartproject.Repo.UserRepository;
import com.shoppingcart.shoppingcartproject.Servicex.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class CartController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartRepositry cartRepositry;


    @GetMapping("/cart/add")
    public String shoeCartForm(Model model) {
        List<Product> productList = productRepository.findAll();
        List<User> userList = userRepository.findAll();
        model.addAttribute("cart", new Cart());
        model.addAttribute("productList", productList);
        model.addAttribute("userList", userList);

        return "cart_form";
    }

    @PostMapping("/cart/save")
    public String saveCart(Cart cart) {
        cartRepositry.save(cart);
        return "redirect:/cart/list";

    }


    @GetMapping("/cart/list")
    public String listOfCart(Model model) {
        List<Cart> listCart = cartRepositry.findAll();
        model.addAttribute("listCart", listCart);
        return "cart_table";

    }

    @GetMapping("/deleteCart/{id}")
    public String deleteCart(@PathVariable (value = "id") long id) {


        this.cartRepositry.deleteById(id);
        return "redirect:/cart/list";
    }


}
