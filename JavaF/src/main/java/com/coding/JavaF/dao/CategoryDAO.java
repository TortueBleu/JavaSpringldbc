package com.coding.JavaF.dao;


import com.coding.JavaF.models.Category;
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

    public List<Category> getById(int id) {
        String sql = "SELECT * FROM Category WHERE id=?";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Category.class), id);
    }


    public int add(Category c) {
        String sql = "INSERT INTO Category (id, name) VALUES (?, ?);";
        return jdbcTemplate.update(sql, c.getId(), c.getName());
    }

    public int updateById(Category c, int id){
        String sql = "UPDATE Category SET name=? WHERE id=?";
        return jdbcTemplate.update(sql,id);
    }


    public int delete(int id){
        String sql = "DELETE FROM Category WHERE id=?";
        return jdbcTemplate.update(sql, id);
    }

}

