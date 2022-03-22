package com.simplilearn.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
	
	@GetMapping("/user")
	public String getuser() {
		
		RestTemplate restTemplate= new RestTemplate();
		UserEntity user= restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/1", UserEntity.class);
		return user.toString();
	}
	
	@GetMapping("/user/{id}")
	public String getuserByid(@PathVariable int id) {
		
		RestTemplate restTemplate= new RestTemplate();
		UserEntity user= restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/"+id, UserEntity.class);
		return user.toString();
	}

}
