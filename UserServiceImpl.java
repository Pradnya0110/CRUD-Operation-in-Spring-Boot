package com.crudapplication.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.crudapplication.crud.Doc.UserDoc;
import com.crudapplication.crud.model.User;

@Service
public class UserServiceImpl implements UserService {
@Autowired
	private UserDoc userdoc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		userdoc.save(user);
		return user;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userdoc.findAll();
	}
/*	@GetMapping
	public User getUser(@PathVariable String userId) {
	
		return this.UserService.getUser(Long.parseLong(userId));
		
	}   */

	@Override
	public User getUser(long userId) {
		// TODO Auto-generated method stub
		return userdoc.findById(userId).get();
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		userdoc.save(user);
		return user;
	}

	@Override
	public User deleteUser(long user) {
		// TODO Auto-generated method stub
		return userdoc.findById(user).get();

	}
	

}