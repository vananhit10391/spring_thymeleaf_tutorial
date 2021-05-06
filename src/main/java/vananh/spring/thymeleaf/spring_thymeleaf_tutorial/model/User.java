package vananh.spring.thymeleaf.spring_thymeleaf_tutorial.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Long id;

    private String name;

    private String role;
}
