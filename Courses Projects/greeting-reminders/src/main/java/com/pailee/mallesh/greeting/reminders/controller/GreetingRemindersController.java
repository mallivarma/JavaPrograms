package com.pailee.mallesh.greeting.reminders.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pailee.mallesh.greeting.reminders.beans.PaileeWorldBean;
import com.pailee.mallesh.greeting.reminders.beans.SignUpDataRequest;
import com.pailee.mallesh.greeting.reminders.beans.SignUpDataResponse;

@RestController
public class GreetingRemindersController {

	@GetMapping(path = "/pailee-mallesh")
	public String helloWorld() {
		return "Hello Mallesh";
	}

	@GetMapping(path = "/just-try")
	public String helloWorld2() {
		return "Hello Mallesh";
	}

	
	@GetMapping(path = "/pailee-mallesh-bean")
	public PaileeWorldBean helloWorldBean() {
		return new PaileeWorldBean("Pailee World - Changed");
	}
	
	@CrossOrigin
	@GetMapping(path = "/paileemallesh/a/{name}")
	public PaileeWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new PaileeWorldBean(String.format("Good Luck, %s", name));
	}
	@CrossOrigin
	@PostMapping(path="/greeting-for-reminders/signUpData",consumes = "application/json", produces = "application/json")
	public SignUpDataResponse signUp(@RequestBody SignUpDataRequest request) {
		
		String firstName= request.getFirstName();
		String lastName= request.getLastName();
		String email= request.getEmail();
		String password= request.getPassword();
		
		System.out.println("Received Objects "+firstName + lastName + email 
				+password);
		
		SignUpDataResponse response = new SignUpDataResponse();
		response.setResult("Successfully Created,Thank you!");
		response.setFirstName(firstName);
		response.setLoggedIn(true);
		return response;
	}
	
}
