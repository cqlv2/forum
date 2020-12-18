package dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
