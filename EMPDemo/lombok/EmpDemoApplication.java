package com.example.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmpDemoApplication {

	
		public static void main(String[] args) {
		//	SpringApplication.run(Demo1Application.class, args);
			
			ConfigurableApplicationContext context = SpringApplication.run(EmpDemoApplication.class, args);
			
			Person p = context.getBean(Person.class);
			p.setEid(1);
			p.setEname("Deepthi");
			p.setEjob("Java-Full-Stack-Developer");
			System.out.println(p.getEid()+ "\n" + p.getEname()+ "\n" + p.getEjob());
		}

	}
