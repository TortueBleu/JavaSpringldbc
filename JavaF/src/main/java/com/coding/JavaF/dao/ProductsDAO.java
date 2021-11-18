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


    public List<Products> listAll(){
        String sql = "SELECT * FROM Products";

        List<Products> list = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Products.class));

        return list;

    }


    public List<Products> findbyId(){
    String sql = "SELECT products WHERE id=?";
    return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Products.class));

    }

    public int add(Products p) {
        String sql = "INSERT INTO products ('id', 'name', 'rating, 'type','createdAt', 'categoryId') VALUES (?,?,?,?,?,?);";

        return jdbcTemplate.update(sql, p.getId(), p.getName(), p.getType(), p.getRating(), p.getCreatedAt(), p.getCategoryId());
    }

    public int put(Products p){
        String sql = "UPDATE products SET type = ?, rating = ?, name = ? WHERE id = ?";
        return jdbcTemplate.update(sql, p.getId(), p.getName(), p.getType(), p.getRating(), p.getCreatedAt(), p.getCategoryId());
    }


  //  public int delete(Products p){
  //      String sql = "DELETE products WHERE id = ?";
 //       return  jdbcTemplate.delete(sql);
 //   }


    public Products findById(Long userId) {
        String sql = "SELECT * FROM products WHERE id=? ;";
        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Products.class), userId);
    }

}
