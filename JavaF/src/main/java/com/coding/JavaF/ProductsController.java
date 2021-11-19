package com.coding.JavaF;

import com.coding.JavaF.dao.CategoryDAO;
import com.coding.JavaF.dao.ProductsDAO;

import com.coding.JavaF.models.Category;
import com.coding.JavaF.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@Controller
public class ProductsController {

    @Autowired
    private ProductsDAO productsService;

    @RequestMapping("/products")
    public String indexProducts(Model model) {
        model.addAttribute("listProducts", productsService.listAll());
        return "indexProducts";}

    @GetMapping("/products/affichage")
    public List<Products> getAllProducts(){
        return productsService.listAll();
    }


    @PostMapping("products/add")
    public int createProducts(@RequestBody Products p) {
        return productsService.add(p);

    }

    @PutMapping("products/update")
    public int updateCategory(@RequestBody Products p) {
        return productsService.put(p);
    }

    @DeleteMapping("products/delete")
    public int deleteCategory(@RequestBody Products p) {
        return productsService.delete(p);
    }


}
