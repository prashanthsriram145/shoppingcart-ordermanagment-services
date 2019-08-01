package com.visa.shoppingcart.orders.services;

import com.visa.shoppingcart.customer.customer.dao.ShoppingCartRepository;
import com.visa.shoppingcart.customer.customer.entities.ShoppingCartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public List<ShoppingCartItem> getAllItemsInShoppingCart(String customerId) {
        return shoppingCartRepository.getShoppingCartItemsByCustomerId(customerId);
    }

    @Override
    public boolean addToShoppingCart(ShoppingCartItem shoppingCartItem) {
        ShoppingCartItem savedShoppingCartItem = shoppingCartRepository.save(shoppingCartItem);
        return savedShoppingCartItem != null;
    }
}
