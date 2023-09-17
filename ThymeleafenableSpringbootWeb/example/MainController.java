package com.demo.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	/* http://localhost:8080/evenForm */
	@GetMapping("/evenForm")
	public String evenForm() {
		return "eventest";
	}
	
	/*http://localhost:8080/processEven */
	@GetMapping("/processEven")
	public String processEven(@RequestParam("number") int number, Model model) {
		model.addAttribute("number", number);
		if (number % 2 == 0) {			
			model.addAttribute("result", "Even");
		}else {
			model.addAttribute("result", "Not Even");
		}
		return "eventresult";
	}
	
}

