package vananh.spring.thymeleaf.spring_thymeleaf_tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vananh.spring.thymeleaf.spring_thymeleaf_tutorial.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
