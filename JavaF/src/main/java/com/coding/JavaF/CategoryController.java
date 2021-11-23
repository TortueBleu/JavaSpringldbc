package com.coding.JavaF;

import com.coding.JavaF.dao.CategoryDAO;
import com.coding.JavaF.models.Category;
import com.coding.JavaF.models.viewmodels.CategoryViewModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {


    @Autowired
    private CategoryDAO categoryService;


    @RequestMapping("/categories")
    public String indexCategory(Model model) {
        model.addAttribute("listCategory", categoryService.listAll());
        return "indexCategory";

    }
    @RequestMapping(value = {"/categories"}, method = RequestMethod.GET)
    public List<Category> getAllCategories()
    {
        return categoryService.listAll();
    }

    @RequestMapping(value = {"/categories/{id}"}, method = RequestMethod.GET)
    public @ResponseBody List<Category> getById (@PathVariable int id){

    return categoryService.getById(id);
    }


    @RequestMapping(value = {"/categories/add"}, method = RequestMethod.POST)
    public int add (@RequestBody Category c){
        return categoryService.add(c);
    }

    @PutMapping("/categories/{id}")
    public int update(@RequestBody Category c , @PathVariable int id)
    {
        return categoryService.updateById(c, id);
    }

    @DeleteMapping("/categories/{id}")
    public int delete(@PathVariable int id){
       return categoryService.delete(id);
}


}

