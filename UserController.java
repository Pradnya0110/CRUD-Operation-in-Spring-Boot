package com.crudapplication.crud.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapplication.crud.model.User;
import com.crudapplication.crud.services.UserService;

import java.util.List;

//import com.crudapplication.crud.services.User;

@RestController
@CrossOrigin
public class UserController {
	
	private static final String UserService = null;
	@Autowired
	private UserService userservice;
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user)
	{
		return this.userservice.addUser(user);
	}
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return this.userservice.getUsers();
	}
	
	
	@GetMapping("/users/(userId)")
	public User getUser(@PathVariable String userId) {
		
		return this.userservice.getUser(Long.parseLong(userId));
	}
	@PutMapping("/user")
	public User updateUser(@RequestBody User user)
	{
		return this.userservice.updateUser(user);
		
	}
	
	@DeleteMapping("/users/(userId)")
	public User deleteUser(@PathVariable String userId) {
		return this.userservice.deleteUser(Long.parseLong(userId));

	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
