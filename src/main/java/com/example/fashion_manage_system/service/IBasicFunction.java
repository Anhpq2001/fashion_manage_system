package com.example.fashion_manage_system.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface IBasicFunction<E> {
    void insertItem(HttpServletRequest request, HttpServletResponse response);
    void updateItem(HttpServletRequest request, HttpServletResponse response);
    void removeItem(HttpServletRequest request, HttpServletResponse response);
    void showAll(HttpServletRequest request, HttpServletResponse response);
    E findOne(HttpServletRequest request, HttpServletResponse response);
}
