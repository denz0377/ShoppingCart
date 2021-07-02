package com.shoppingcart.shoppingcartproject.dto;


import com.shoppingcart.shoppingcartproject.Modelx.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

    private User user;
}