package com.example.restfarmanet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmaController {


	@GetMapping("/farma")
	public String farma(@RequestParam(value = "comuna") String comuna) {
		//return new Greeting(counter.incrementAndGet(), String.format(template, name));
        return "Hello world";
	}
}