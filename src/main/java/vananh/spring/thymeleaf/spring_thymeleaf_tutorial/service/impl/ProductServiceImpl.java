package vananh.spring.thymeleaf.spring_thymeleaf_tutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vananh.spring.thymeleaf.spring_thymeleaf_tutorial.model.Product;
import vananh.spring.thymeleaf.spring_thymeleaf_tutorial.repository.ProductRepository;
import vananh.spring.thymeleaf.spring_thymeleaf_tutorial.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository repository;

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }
}
