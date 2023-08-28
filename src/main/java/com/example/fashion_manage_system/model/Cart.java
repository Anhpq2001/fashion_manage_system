package com.example.fashion_manage_system.model;

public class Cart {
    private int id;
    private int quantity;
    private double totalPrice;
    private int billId;
    private int productId;
    private int userId;

    public Cart() {
    }

    public Cart(int id, int quantity, double totalPrice, int billId, int productId, int userId) {
        this.id = id;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.billId = billId;
        this.productId = productId;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
