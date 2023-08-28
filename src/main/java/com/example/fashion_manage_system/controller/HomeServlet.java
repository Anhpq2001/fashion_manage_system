package com.example.fashion_manage_system.controller;

import com.example.fashion_manage_system.service.HomeManagement;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    HomeManagement homeManagement = new HomeManagement();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "insert":
                break;
            case "update":
                break;
            case "delete":
                break;
            case "":
                homeManagement.showAll(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("acion");
        if(action == null){
            action = "";
        }
        switch (action){
            case "insert":
                break;
            case "update":
                break;
            case "delete":
                break;
        }
    }
}
