package com.example.fashion_manage_system.DAO;

import com.example.fashion_manage_system.model.Product;
import com.mysql.cj.jdbc.ClientPreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ProductDBContext extends DBContext {
    Connection connection = getConnection();
    private final String SELECT_ITEM = "select * from product;";
    private final String INSERT_ITEM = "insert into product(name, price, quantity, url_image, description, c_id) " +
                                        "value (?, ?, ?, ?, ?, ?);";
    private final String DELETE_ITEM = "delete from product where id = ?;";
    private final String UPDATE_ITEM = "update product\n" +
                                        "set name = ?, price = ?, quantity = ?, url_image = ?, description = ?, c_id = ?\n" +
                                        "where id = ?;";

    public List<Product> selectAll(){
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ITEM);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                Double price = resultSet.getDouble(3);
                int quantity = resultSet.getInt(4);
                String urlImage = resultSet.getString(5);
                String description = resultSet.getString(6);
                int categoryId = resultSet.getInt(7);
                products.add(new Product(id, name, price, quantity, urlImage, description, categoryId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    public void insert(Product product){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ITEM);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getDescription());
            preparedStatement.setInt(5, product.getCategoryId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ITEM);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Product product){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ITEM);
            preparedStatement.setString(1,product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getDescription());
            preparedStatement.setInt(5, product.getCategoryId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
