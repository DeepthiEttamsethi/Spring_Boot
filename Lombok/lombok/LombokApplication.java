package com.example.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LombokApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LombokApplication.class, args);

        Employee e = context.getBean(Employee.class);
        e.setEId(100);
        e.setEName("Deepthi");
        e.setJob("Java-Full-Stack-Developer");

        System.out.println(e.getEId() + " " + e.getEName() + " " + e.getJob());
    }
}
