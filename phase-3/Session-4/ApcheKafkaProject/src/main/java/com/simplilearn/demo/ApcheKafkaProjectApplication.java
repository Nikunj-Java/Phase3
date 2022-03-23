package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@ComponentScan("com.simplilearn.demo")
public class ApcheKafkaProjectApplication {
	
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ApcheKafkaProjectApplication.class, args);
	}
	
    @KafkaListener(topics = "ecommerce", groupId = "group-id")
    public void listen(String message) {
       System.out.println("Received Message in group - group-id: " + message);
    }
}
