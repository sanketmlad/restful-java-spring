package com.example.rest.webservices.restfulwebservies.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	public static int Usercount = 3;
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(1, "Sanket", new Date()));
		users.add(new User(2, "Sank", new Date()));
		users.add(new User(3, "San", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if (user.getId()==null) {
			user.setId(++Usercount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for (User user:users) {
			if (user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
	public User deletebyId(int id) {
		Iterator<User> iterator = users.iterator();
 		while(iterator.hasNext()) {
 			User user = iterator.next();
 			if(user.getId() == id) {
 				iterator.remove();
 				return user;
 			}
 		}
		return null;
		
	}
}
