package com.example.fashion_manage_system.service;

import com.example.fashion_manage_system.DAO.ProductDBContext;
import com.example.fashion_manage_system.model.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomeManagement implements IBasicFunction{
    ProductDBContext productDBContext = new ProductDBContext();
    @Override
    public void insertItem(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    public void updateItem(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    public void removeItem(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    public void showAll(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = productDBContext.selectAll();
        request.setAttribute("products", products);
        try {
            request.getRequestDispatcher("/view/jsp/Home.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object findOne(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }
}
