package com.simplilearn.demo;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {



	public CustomEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "This is Custom Event";
	}

}
