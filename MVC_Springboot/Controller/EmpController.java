package com.example.Controller;

import org.springframework.stereotype.Controller;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Entity.Emp;
import com.example.Repository.EmpRepository;

@Controller
public class EmpController {
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
}
