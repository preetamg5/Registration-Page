package com.virtusa.repositary;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.pojo.User;

@Repository
public class UserRepositaryImp implements UserRepositary {




	@Autowired
	 private  MyRepository userRep;
	
	
	@Override
	public User saveUser(User u) {
		User user = userRep.save(u);
		System.out.println("User Saved");
		return user;
	}
	
}





































		
