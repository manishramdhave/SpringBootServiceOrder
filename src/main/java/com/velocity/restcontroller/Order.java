package com.velocity.model;

public class Order {
    private int orderId;
    private String product;
    private double amount;
    private String status;

    // Constructor
    public Order(int orderId, String product, double amount, String status) {
        this.orderId = orderId;
        this.product = product;
        this.amount = amount;
        this.status = status;
    }

    // Getters and Setters
    public int getOrderId() { return orderId; }
    public String getProduct() { return product; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }
}
