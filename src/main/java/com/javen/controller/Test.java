package com.javen.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/jenkins")
public class Test {
	
	
	@ResponseBody
	@RequestMapping("/tt")
	public String getS() {
		
		//String string = sampleService.getString("wyf");
		return "jenkinscs";
          
	}
		

	
	
 
 
 

}
