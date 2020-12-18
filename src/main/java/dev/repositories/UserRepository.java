package dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
