package com.visa.shoppingcart.orders.entities;

import javax.persistence.*;
import java.util.Date;


public class Orders {

    @Id
    @Column(name = "order_id", nullable = false)
    private String orderId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "isregistered", nullable = false)
    private boolean registered;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "delivery_addr_id", nullable = false)
    private DeliveryAddress deliveryAddress;

    @Column(name = "payment_type", nullable = false)
    private String paymentType;

    @Column(name = "order_date", nullable = false)
    private Date orderDate;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "total", nullable = false)
    private double total;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
