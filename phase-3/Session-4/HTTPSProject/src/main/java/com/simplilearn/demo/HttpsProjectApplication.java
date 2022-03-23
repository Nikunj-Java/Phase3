package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.simplilearn.demo")
public class HttpsProjectApplication {
	
	
	///generate the key paste this code to cmd
	///keytool -genkey -alias selfsigned_localhost_sslserver -keyalg RSA -keysize 2048 -validity 700 -keypass changeit -storepass changeit -keystore ssl-server.jks

	public static void main(String[] args) {
		SpringApplication.run(HttpsProjectApplication.class, args);
	}

}
