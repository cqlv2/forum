package dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.Topic;
import dev.exception.repoException;
import dev.repositories.topicRepository;

@Service
public class TopicService {

	private topicRepository topicRepo;

	public TopicService(topicRepository topicRepo) {
		super();
		this.topicRepo = topicRepo;
	}

	public List<Topic> getAll() {
		return topicRepo.findAll();
	}

	public Topic getById(Integer id) throws repoException {

		Optional<Topic> t = topicRepo.findById(id);
		if (t.isPresent()) {
			return t.get();
		} else
			throw new repoException("id inconnu");
	}

	public Topic addUpdate(Topic t) {
		topicRepo.save(t);
		return t;
	}

	public boolean remove(int id) throws repoException {
		Topic t=this.getById(id);
		topicRepo.delete(t);
		return true;
	}

}
