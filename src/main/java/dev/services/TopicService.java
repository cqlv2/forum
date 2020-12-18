package dev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.entity.Topic;
import dev.repositories.topicRepository;

@Service
public class TopicService {

	private topicRepository topicRepo;

	public TopicService(topicRepository topicRepo) {
		super();
		this.topicRepo = topicRepo;
	}

	public List<Topic> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}
