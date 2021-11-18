package com.coding.JavaF.dao;


import com.coding.JavaF.models.Category;
import com.coding.JavaF.models.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public class CategoryDAO {
@Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Category> listAll() {
        String sql = "SELECT * FROM Category";
        List<Category> list = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Category.class));
        return list;
    }

    public int add(Category c) {
        String sql = "INSERT INTO Category (id, name) VALUES (?, ?);";
        return jdbcTemplate.update(sql, c.getId(), c.getName());
    }

    public int update(Category c){
        String sql = "UPDATE Category SET id=?, name=?";
        return jdbcTemplate.update(sql,c.getId(),c.getName());
    }


    /*public int delete(Category c){
        String sql = "DELETE FROM Category WHERE name=?";
        return jdbcTemplate.delete(sql, c.getName());
    }
*/

}

