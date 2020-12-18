package dev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.entity.Role;
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
	
	
}
