package dev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.entity.Message;
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
	
}
