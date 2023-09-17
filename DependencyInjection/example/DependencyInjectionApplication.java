package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Application;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
    	//SpringApplication.run(Application.class, args);
    	
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        Student s = context.getBean(Student.class);
        Address adr = context.getBean(Address.class); // Get the Address bean

        // Set properties for the Address bean
        adr.setDoorno(12);
        adr.setCity("Vijayawada");
        adr.setMobileno("96325874925");

        // Set properties for the Student bean
        s.setId(1);
        s.setName("Deepthi");
        s.setAddress(adr); // Set the Address instance in the Student

        // Print the Student details
        System.out.println(s.getId() + "\n" + s.getName() + "\n" + s.getAddress().getDoorno() + " " + s.getAddress().getCity() + " " + s.getAddress().getMobileno());
    }
}
