package com.diet.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DietController {
	
	@RequestMapping("/usToIndianRupee")
	 public float usDollar(@RequestParam int dollar){
		
		 return dollar * 78.45f;
	}

}
