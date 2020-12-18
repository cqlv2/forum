package dev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.entity.User;
import dev.repositories.UserRepository;

@Service
public class UserService {

	
	UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
	public List<User> getAll(){
		return userRepo.findAll();
	}
}
