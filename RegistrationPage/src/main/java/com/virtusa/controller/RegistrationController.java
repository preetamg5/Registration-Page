package com.virtusa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.virtusa.pojo.JavaObjectConverter;
import com.virtusa.pojo.User;
import com.virtusa.repositary.UserRepositary;

@Controller
public class RegistrationController {
	@Autowired
	private UserRepositary userrep;
	 @GetMapping(value = "/getdetails")
	
	public String getDetails(Model m) throws JsonProcessingException {
		RestTemplate rt = new RestTemplate();
		
		User s = rt.getForObject("http://localhost:8080/regprocess", User.class);

		
		User user = userrep.saveUser(s);
		 String jsondetails = JavaObjectConverter.jsonFormate(user);
		
				 if(jsondetails != null && !jsondetails.isEmpty()) {
					 m.addAttribute("message", "register successfully");
					
					 m.addAttribute("details", jsondetails);
					 
				 }
				 else {
					 m.addAttribute("message", "register unsuccessfully");
				 }
		return "result";

	}


	

	
	
}