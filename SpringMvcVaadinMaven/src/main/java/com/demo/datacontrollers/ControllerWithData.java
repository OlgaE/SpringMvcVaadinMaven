package com.demo.datacontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.demo.model.Person;

@Controller
public class ControllerWithData {

	@Autowired
	@Qualifier("person")
	private Person person;
	
	private String message;
	
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String printName(){

		return "The name is " + person.getName();
	}
}
