package com.cn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(Model model){
		
		model.addAttribute("name", "≈À«ø«ø");
		
		return "hello";
	}
	
	public static void main(String[] args){
		
		SpringApplication.run(HelloController.class, args);
		
		
	}

}
