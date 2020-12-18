package dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.User;
import dev.entity.User;
import dev.exception.repoException;
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
	
	public User getById(Integer id) throws repoException {

		Optional<User> t = userRepo.findById(id);
		if (t.isPresent()) {
			return t.get();
		} else
			throw new repoException("id inconnu");
	}

	public User addUpdate(User t) {
		userRepo.save(t);
		return t;
	}

	public boolean remove(int id) throws repoException {
		User t=this.getById(id);
		userRepo.delete(t);
		return true;
	}

}
