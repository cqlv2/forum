package dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.Role;
import dev.entity.Role;
import dev.exception.repoException;
import dev.repositories.RoleRepository;

@Service
public class RoleService {

	RoleRepository roleRepo;

	public RoleService(RoleRepository roleRepo) {
		super();
		this.roleRepo = roleRepo;
	}
	
	public List<Role> getAll(){
		return roleRepo.findAll();
	}
	
	public Role getById(Integer id) throws repoException {

		Optional<Role> t = roleRepo.findById(id);
		if (t.isPresent()) {
			return t.get();
		} else
			throw new repoException("id inconnu");
	}

	public Role addUpdate(Role t) {
		roleRepo.save(t);
		return t;
	}

	public boolean remove(int id) throws repoException {
		Role t=this.getById(id);
		roleRepo.delete(t);
		return true;
	}
	
}
