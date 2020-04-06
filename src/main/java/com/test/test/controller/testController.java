package com.test.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	@GetMapping(value="/test")
	public @ResponseBody String conected() 	{
		return "Working";
		

	}

}
