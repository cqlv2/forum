package dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
