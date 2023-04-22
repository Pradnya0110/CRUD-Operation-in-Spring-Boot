package com.crudapplication.crud.Doc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapplication.crud.model.User;

public interface UserDoc extends JpaRepository<User, Long> {

	
	
}
