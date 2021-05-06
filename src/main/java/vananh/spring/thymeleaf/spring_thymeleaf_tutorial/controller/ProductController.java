package vananh.spring.thymeleaf.spring_thymeleaf_tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vananh.spring.thymeleaf.spring_thymeleaf_tutorial.model.Product;
import vananh.spring.thymeleaf.spring_thymeleaf_tutorial.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/")
    public String getAll(Model model) {
        List<Product> productList = new ArrayList<>();
        productList = service.getAll();
        model.addAttribute("products", productList);
        return "products";
    }
}
