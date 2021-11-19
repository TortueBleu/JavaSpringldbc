package com.coding.JavaF;

import com.coding.JavaF.dao.CategoryDAO;
import com.coding.JavaF.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {


    @Autowired
    private CategoryDAO categoryService;
    private String errorMessage;


    @RequestMapping("/categories")
    public String indexCategory(Model model) {
        model.addAttribute("listCategory", categoryService.listAll());
        return "indexCategory";
    }

    @RequestMapping(value = {"/categories/affichage"}, method = RequestMethod.GET)
    public List<Category> getAllCategories() {
        return categoryService.listAll();
    }


    @PostMapping("/category/add")
    public int createCategory(@RequestBody Category c) {
        return categoryService.add(c);
    }


    @PutMapping("categories/update")
    public int updateCategory(@RequestBody Category c) {
        return categoryService.put(c);
    }

    @DeleteMapping("categories/delete")
    public int deleteCategory(@RequestBody Category c) {
        return categoryService.delete(c);
    }
}
        //@RequestMapping(value = {"/categories/add"}, method = RequestMethod.POST)
    //public String addPost(Model model, @ModelAttribute("categoriesForm") CategoryViewModels categoryViewModels){


  //          Category category = new Category();
  //          category.setId(categoryViewModels.getId());
  //          category.setName(categoryViewModels.getName());
  //          categoryService.add(category);

  //          return "redirect:/categories";
   //     }
        //errorMessage = "Nom obligatoire";
        //model.addAttribute("erroreMessage", errrorMessage);
  //      return "add";
 //   }


 //   @RequestMapping(value = {"/categories/update"}, method = RequestMethod.PATCH)
  //  public String update(Model model, @ModelAttribute("categoriesUpdate") CategoryViewModels categoryViewModels){
  //      if (){
    //        Category category = new Category();
    //        category.setId(categoryViewModels.getId());
    //        category.setName(categoryViewModels.getName());
   //         categoryService.update(category);

  //          return "redirect:/categories";
 //       }
        //errorMessage = "";
        //model.addAttribute("erroreMessage", errroMessage);
 //       return "";
 //   }
