package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.services.TopicService;

@RestController
@CrossOrigin
@RequestMapping("topic")
public class topicCtrl {

	private TopicService topicServ;

	public topicCtrl(TopicService topicServ) {
		super();
		this.topicServ = topicServ;
	}
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok().body(topicServ.getAll());
	}
}
