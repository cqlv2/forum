package dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.Message;
import dev.entity.Message;
import dev.exception.repoException;
import dev.repositories.MessageRepository;

@Service
public class MessageService {

	MessageRepository messageRepo;

	public MessageService(MessageRepository messageRepo) {
		super();
		this.messageRepo = messageRepo;
	}
	
	public List<Message> getAll() {
		return messageRepo.findAll();
	}
	
	public Message getById(Integer id) throws repoException {

		Optional<Message> t = messageRepo.findById(id);
		if (t.isPresent()) {
			return t.get();
		} else
			throw new repoException("id inconnu");
	}

	public Message addUpdate(Message t) {
		messageRepo.save(t);
		return t;
	}

	public boolean remove(int id) throws repoException {
		Message t=this.getById(id);
		messageRepo.delete(t);
		return true;
	}
	
}
