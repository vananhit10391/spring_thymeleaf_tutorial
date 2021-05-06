package vananh.spring.thymeleaf.spring_thymeleaf_tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vananh.spring.thymeleaf.spring_thymeleaf_tutorial.model.Product;
import vananh.spring.thymeleaf.spring_thymeleaf_tutorial.model.User;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "Mr.Anh");
        model.addAttribute("count", 10);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1l, "Product 1", 10.00));
        productList.add(new Product(2l, "Product 2", 11.00));
        productList.add(new Product(3l, "Product 3", 12.00));
        productList.add(new Product(4l, "Product 4", 13.00));
        productList.add(new Product(5l, "Product 5", 14.00));


        User user = new User(1l, "van anh", "manager");

        model.addAttribute("products", productList);
        model.addAttribute("user", user);

        return "index";
    }

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }
}
