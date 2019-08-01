package com.visa.shoppingcart.orders.controllers;

import com.visa.shoppingcart.customer.customer.entities.ShoppingCartItem;
import com.visa.shoppingcart.customer.customer.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer-services/v1/shoppingcart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/shoppingCartItems/{customerId}")
    @ResponseBody
    public List<ShoppingCartItem> getAllCustomers(@PathVariable("customerId") String customerId){
        List<ShoppingCartItem> shoppingCartItems = shoppingCartService.getAllItemsInShoppingCart(customerId);
        return shoppingCartItems;
    }

    @PostMapping(path="/addToShoppingCart", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public boolean addCustomer(@RequestBody ShoppingCartItem shoppingCartItem){
        return shoppingCartService.addToShoppingCart(shoppingCartItem);
    }


}
