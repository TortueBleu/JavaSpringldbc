package com.coding.JavaF;

import com.coding.JavaF.dao.CategoryDAO;
import com.coding.JavaF.dao.ProductsDAO;

import com.coding.JavaF.models.Category;
import com.coding.JavaF.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@Controller
public class ProductsController {

    @Autowired
    private ProductsDAO productsService;

  // récupérer tous les produits

    @GetMapping("/products")
    public List<Products> getAllProducts(){

        return productsService.listAll();
    }

    @GetMapping("/products/{id}")
    public List<Products> getProductsById(){
        return productsService.findbyId();
    }

    @PostMapping("/add")
    public int createProducts(@RequestBody Products products) {

       return productsService.add(products);


  //  @PutMapping("/put")
  //  public int putProducts(Products products){

   //     }




 //   @DeleteMapping("/delete")
//    public List<Products> deleteProducts(){

 //  }





    // créer un nouveau produit


    // mettre à jour un produit



    }
}
