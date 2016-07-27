package com.cn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootTest {
	
	@RequestMapping("/")
	public String greeting(){
		
		return "Hello Greeting!";
	}
	
	@RequestMapping("/greet")
	public String greetingA(){
		
		return "Hello GreetingA!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest.class, args);
		
	}

}
