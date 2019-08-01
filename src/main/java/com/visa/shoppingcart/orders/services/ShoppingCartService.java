package com.visa.shoppingcart.orders.services;

import com.visa.shoppingcart.customer.customer.entities.ShoppingCartItem;

import java.util.List;

public interface ShoppingCartService {

    List<ShoppingCartItem> getAllItemsInShoppingCart(String customerId);

    boolean addToShoppingCart(ShoppingCartItem shoppingCartItem);

}
