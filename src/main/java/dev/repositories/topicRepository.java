package dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entity.Topic;

public interface topicRepository extends JpaRepository<Topic, Integer>{

}
