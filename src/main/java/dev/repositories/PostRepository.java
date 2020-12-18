package dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
