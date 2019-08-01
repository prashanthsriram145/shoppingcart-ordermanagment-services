package com.visa.shoppingcart.orders.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shopping_cart_item")
public class ShoppingCartItem implements Serializable {

    @Id
    @Column(name = "cart_item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartItemId;

    @Column(name = "customer_id", nullable = false)
    private String customerId;

    @Column(name = "product_id" , nullable = false)
    private String productId;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    public Integer getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Integer cartItemId) {
        this.cartItemId = cartItemId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
