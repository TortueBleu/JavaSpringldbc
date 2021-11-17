package com.coding.JavaF.dao;


import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;

@Repository
public class categoryDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Category> listAll() {
        String sql = "SELECT * FROM Category";

        List<Category> List = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Category.class));
        return List;
    }
fkjvbqsjfqljdqdslqf
}