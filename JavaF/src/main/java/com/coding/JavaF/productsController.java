package com.coding.JavaF;

import com.coding.JavaF.dao.productsDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class productsController {

    @Autowired
    private productsDAO productsService;


    @RequestMapping("/products")
    public String index(Model model){
        model.addAttribute("listProducts", productsService.listAll());
        return "index";
    }
}
