package dev.services;

import java.util.List;

import dev.entity.Post;
import dev.repositories.PostRepository;

public class PostService {

	private PostRepository postRepo;

	public PostService(PostRepository postRepo) {
		super();
		this.postRepo = postRepo;
	}
	
	public List<Post> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
