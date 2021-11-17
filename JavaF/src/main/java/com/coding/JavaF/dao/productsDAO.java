package com.coding.JavaF.dao;

import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class productsDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<products> listAll() {

    }
}
