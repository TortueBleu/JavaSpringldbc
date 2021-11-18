package com.coding.JavaF;

import com.coding.JavaF.dao.CategoryDAO;
import com.coding.JavaF.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CategoryController {


    @Autowired
    private CategoryDAO categoryService;

    //   @RequestMapping("/category")
    //  public String indexCategory(Model model){
    //    model.addAttribute("listCategory", CategoryDAO.listAll());
    //    return "indexCategory";

    //  }



    @RequestMapping("/category")

    @RequestMapping("/categories")

    public String indexCategory(Model model) {
        model.addAttribute("listCategory", categoryService.listAll());
        return "indexCategory";


        //   @RequestMapping("/category")
//    public List<Category> getAllCategories() {
        //       return CategoryDAO.listAll();
        //   }


        //  @PostMapping("/add")
        //   public @ResponseBody String addNewCategories(@RequestParam String id, @RequestParam String name){

        //      Category cat = new Category();
        //      cat.setId(id);
        //      cat.setName(name);
        //      CategoryDAO.save(cat);
        //     return "SET OK";


    }
}
