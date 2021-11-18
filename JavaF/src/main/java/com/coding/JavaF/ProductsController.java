package com.coding.JavaF;

import com.coding.JavaF.dao.ProductsDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductsController {

    @Autowired
    private ProductsDAO productsService;

    @RequestMapping("/products")
    public String indexProducts(Model model){
        model.addAttribute("listProducts", productsService.listAll());
        return "indexProducts";

    }

    }
