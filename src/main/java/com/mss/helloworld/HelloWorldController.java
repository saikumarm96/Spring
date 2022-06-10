package com.mss.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	HelloWorldService helloWorldService;
	@GetMapping("/display")
	public String display()
	{
		return helloWorldService.display();
		
	}
}
