package com.anand.springboot.sampleApp.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping("/")
	public String function1() {
		return "This is Anand";
	}
}
