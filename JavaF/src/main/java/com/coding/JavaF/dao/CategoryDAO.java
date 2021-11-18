package com.coding.JavaF.dao;


import com.coding.JavaF.models.Category;
import com.coding.JavaF.models.Products;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public class CategoryDAO {

    private static JdbcTemplate jdbcTemplate;

    public static List<Category> listAll() {
        String sql = "SELECT * FROM Category";

        List<Category> list = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Category.class));

        return list;
    }



    public static int add(Category c) {
        String sql = "INSERT INTO Category (id, name) VALUES (?, ?);";
        return jdbcTemplate.update(sql, c.getId(), c.getName());
    }


    public static void save(Category cat) {
    }

}

