/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hd.controllers;

import com.hd.pojo.Category;
import com.hd.pojo.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model){
        List<Category> cates = new ArrayList<>();
        cates.add(new Category(1, "Mobile"));
        cates.add(new Category(2, "Laptop"));
        cates.add(new Category(3, "Tablet"));
        
        
        List<Product> pros = new ArrayList<>();
        pros.add(new Product(1, "Iphone 12", "https://cdn.tgdd.vn/Products/Images/42/250258/iphone-13-xanh-la-thumb-1-200x200.jpg", 20000000l));
        pros.add(new Product(1, "Iphone 14", "https://cdn.tgdd.vn/Products/Images/42/250258/iphone-13-xanh-la-thumb-1-200x200.jpg", 20000000l));
        pros.add(new Product(1, "Laptop MSI", "https://cdn.tgdd.vn/Products/Images/42/250258/iphone-13-xanh-la-thumb-1-200x200.jpg", 20000000l));
        pros.add(new Product(1, "Iphone 15", "https://cdn.tgdd.vn/Products/Images/42/250258/iphone-13-xanh-la-thumb-1-200x200.jpg", 20000000l));
        model.addAttribute("categories", cates);
        model.addAttribute("products", pros);
        return "index";
    }
}
