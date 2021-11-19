package com.coding.JavaF;

import com.coding.JavaF.dao.ProductsDAO;

import com.coding.JavaF.models.Category;
import com.coding.JavaF.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value = {"/products"}, method = RequestMethod.GET)
    public List<Products> getAllProducts()
    {
        return productsService.listAll();
    }

    @RequestMapping(value = {"/products/add"}, method = RequestMethod.POST)
    public int add (@RequestBody Products p){
        return productsService.add(p);
    }
}
