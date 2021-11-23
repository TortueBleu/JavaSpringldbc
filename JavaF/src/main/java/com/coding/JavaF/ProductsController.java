package com.coding.JavaF;

import com.coding.JavaF.dao.ProductsDAO;

import com.coding.JavaF.models.Category;
import com.coding.JavaF.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductsController {

    @Autowired
    private ProductsDAO productsService;

    /*@RequestMapping("/products")
    public String indexProducts(Model model) {
        model.addAttribute("listProducts", productsService.listAll());
        return "indexProducts";
    }*/
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public List<Products> getAllProducts()
    {
        return productsService.listAll();
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody List<Products> getById (@PathVariable int id){

        return productsService.getById(id);
    }

    @RequestMapping(value = {"/add"}, method = RequestMethod.POST)
    public int add (@RequestBody Products p){
        return productsService.add(p);
    }

    @PutMapping("/{id}")
    public int update(@RequestBody Products p , @PathVariable int id)
    {
        return productsService.updateById(p, id);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable int id){
        return productsService.delete(id);
    }

}
