package com.coding.JavaF.dao;

import com.coding.JavaF.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductsDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Products> listAll() {
        String sql = "SELECT * FROM Products";

        List<Products> list = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Products.class));

        return list;
    }


    String sql = "INSERT INTO Products (type, rathing, fullname, email) VALUES (?, ?, ?, ?)";

}
