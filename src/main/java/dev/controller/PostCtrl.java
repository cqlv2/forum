package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.services.PostService;

@RestController
@CrossOrigin
@RequestMapping("post")
public class PostCtrl {

	private PostService postServ;

	public PostCtrl(PostService postServ) {
		super();
		this.postServ = postServ;
	}
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok().body(postServ.getAll());
	}
	
	
}
