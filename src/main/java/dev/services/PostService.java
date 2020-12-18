package dev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.entity.Post;
import dev.repositories.PostRepository;

@Service
public class PostService {

	private PostRepository postRepo;

	public PostService(PostRepository postRepo) {
		super();
		this.postRepo = postRepo;
	}
	
	public List<Post> getAll() {
		return postRepo.findAll();
	}
	
}
