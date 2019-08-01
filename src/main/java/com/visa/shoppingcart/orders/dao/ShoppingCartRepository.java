package com.visa.shoppingcart.orders.dao;

import com.visa.shoppingcart.customer.customer.entities.ShoppingCartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCartItem, Integer> {

    List<ShoppingCartItem> getShoppingCartItemsByCustomerId(String customerId);

}
