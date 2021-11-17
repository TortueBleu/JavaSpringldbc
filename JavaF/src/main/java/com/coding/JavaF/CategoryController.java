package com.coding.JavaF;

import com.coding.JavaF.dao.CategoryDAO;
import com.coding.JavaF.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CategoryController {

   @Autowired
    private CategoryDAO categoryService;

}
