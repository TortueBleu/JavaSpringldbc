package com.coding.JavaF.dao;

import com.coding.JavaF.models.Category;
import com.coding.JavaF.models.viewmodels.CategoryViewModels;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;

public class CategoryTest {
    private static JdbcTemplate jdbcTemplate;
    public int add (Model model, Category c){
        String[] tableauTest = new String[0];
        model.addAttribute("categoriesForm", new CategoryViewModels());
        String sql = "INSERT INTO Category (id, name) VALUES (1, Antoine);";
        System.out.println(sql);
        return  jdbcTemplate.update(sql, c.getId(), c.getName());
    }

}
