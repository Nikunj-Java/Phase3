package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@Autowired
	ConfigurableApplicationContext appContext;
	
	@Autowired
	CustomEventPublisher cep;

	@GetMapping("/default")
	public String eventhandling() {
		
		appContext.start();
		appContext.stop();
		
		return "success";
	}
	
	
	@GetMapping("/custom")
	public String Custom() {
		
		cep.publish();
		return "customevent";
	}
	
	 
	
	 

}
