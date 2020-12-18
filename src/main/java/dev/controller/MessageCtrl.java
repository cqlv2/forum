package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.services.MessageService;

@RestController
@CrossOrigin
@RequestMapping("message")
public class MessageCtrl {

	MessageService messageServ;

	public MessageCtrl(MessageService messageServ) {
		super();
		this.messageServ = messageServ;
	}
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok().body(messageServ.getAll());
	}
	
	
}
