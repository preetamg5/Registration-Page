package com.virtusa.pojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjectConverter {
	
	public static String jsonFormate(User u) throws JsonProcessingException{
		
		ObjectMapper mapper = new ObjectMapper();
		
		String details = mapper.writeValueAsString(u);
		
		
		return details;
	}
	

}
