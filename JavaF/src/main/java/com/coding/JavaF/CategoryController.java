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

    //   @RequestMapping("/category")
    //  public String indexCategory(Model model){
    //    model.addAttribute("listCategory", CategoryDAO.listAll());
    //    return "indexCategory";

    //  }


    @RequestMapping("/categories")
    public String indexCategory(Model model) {
        model.addAttribute("listCategory", categoryService.listAll());
        return "indexCategory";
        //  @PostMapping("/add")
        //   public @ResponseBody String addNewCategories(@RequestParam String id, @RequestParam String name){

        //      Category cat = new Category();
        //      cat.setId(id);
        //      cat.setName(name);
        //      CategoryDAO.save(cat);
        //     return "SET OK";

    }
    @RequestMapping(value = {"/categories/affichage"}, method = RequestMethod.GET)
    public List<Category> getAllCategories()
    {
        return categoryService.listAll();
    }

    @RequestMapping(value = {"/categories/add"}, method = RequestMethod.POST)
    public String add (Model model){
        model.addAttribute("categoriesForm", new CategoryViewModels());
        String antoine = "test";
        System.out.println(antoine);
        return antoine;
    }

    //@RequestMapping(value = {"/categories/add"}, method = RequestMethod.POST)
    /*public String addPost(Model model, @ModelAttribute("categoriesForm") CategoryViewModels categoryViewModels){

        if (categoryViewModels.getName() != null && categoryViewModels.getName().length() > 0){
            Category category = new Category();
            category.setId(categoryViewModels.getId());
            category.setName(categoryViewModels.getName());
            categoryService.add(category);

            return "redirect:/categories";
        }
        //errorMessage = "Nom obligatoire";
        //model.addAttribute("erroreMessage", errrorMessage);
        return "add";
    }


    @RequestMapping(value = {"/categories/update"}, method = RequestMethod.PATCH)
    public String update(Model model, @ModelAttribute("categoriesUpdate") CategoryViewModels categoryViewModels){
        if (){
            Category category = new Category();
            category.setId(categoryViewModels.getId());
            category.setName(categoryViewModels.getName());
            categoryService.update(category);

            return "redirect:/categories";
        }
        //errorMessage = "";
        //model.addAttribute("erroreMessage", errroMessage);
        return "";
    }


   // @RequestMapping(value = {"/categrories/delete"}, method = RequestMethod.DELETE)
    //public String delete(Model model){
        
    //}


*/

}

