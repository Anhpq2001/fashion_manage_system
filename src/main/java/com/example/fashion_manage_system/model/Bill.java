package com.example.fashion_manage_system.model;

public class Bill {
    private int id;
    private String code;
    private double totalPrice;
    private int userId;

    public Bill() {
    }

    public Bill(int id, String code, double totalPrice, int userId) {
        this.id = id;
        this.code = code;
        this.totalPrice = totalPrice;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
