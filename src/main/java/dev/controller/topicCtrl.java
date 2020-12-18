package dev.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.dto.topic.TopicDtoQuery;
import dev.exception.repoException;
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

	@GetMapping(params = { "id" })
	public ResponseEntity<?> getById(@RequestParam Integer id) {
		try {
			return ResponseEntity.ok().body(topicServ.getById(id));
		} catch (repoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping
	public ResponseEntity<?> add(@Valid @RequestBody TopicDtoQuery tQuery, BindingResult resVal) {
		if (!resVal.hasErrors()) {
			try {
				return ResponseEntity.ok().body(topicServ.addUpdate(tQuery));
			} catch (repoException e) {
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		} else {
			return ResponseEntity.badRequest().body(resVal.getAllErrors());
		}
	}

}
