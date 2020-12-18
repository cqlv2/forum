package dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.Post;
import dev.entity.Post;
import dev.exception.repoException;
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
	
	public Post getById(Integer id) throws repoException {

		Optional<Post> t = postRepo.findById(id);
		if (t.isPresent()) {
			return t.get();
		} else
			throw new repoException("id inconnu");
	}

	public Post addUpdate(Post t) {
		postRepo.save(t);
		return t;
	}

	public boolean remove(int id) throws repoException {
		Post t=this.getById(id);
		postRepo.delete(t);
		return true;
	}
}
