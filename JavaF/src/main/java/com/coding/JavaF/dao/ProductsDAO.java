package com.coding.JavaF.dao;

import com.coding.JavaF.models.Category;
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

    String sql = "INSERT INTO Products (type, rathing, fullname, email) VALUES (?, ?, ?, ?)";


    public List<Products> listAll() {
        String sql = "SELECT * FROM Products";
        List<com.coding.JavaF.models.Products> list = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Products.class));
        return list;
    }

    public int add(Products p) {
        String sql = "INSERT INTO Products (id, name, type, rating, categoryId) VALUES (?, ?, ?, ?, ?);";
        return jdbcTemplate.update(sql, p.getId(), p.getName(), p.getType(), p.getRating(), p.getCategoryId());
    }
}
