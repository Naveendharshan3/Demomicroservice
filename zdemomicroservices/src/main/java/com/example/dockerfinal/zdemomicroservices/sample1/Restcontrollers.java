package com.example.dockerfinal.zdemomicroservices.sample1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontrollers {
	
	@GetMapping
	public String all()
	{
		return "Hi there here is ur  first docker container RUNNING SUCESSFULLY...!";
	}

}
