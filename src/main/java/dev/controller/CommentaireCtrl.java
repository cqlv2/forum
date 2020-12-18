package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.services.CommentaireService;

@RestController
@CrossOrigin
@RequestMapping("commmentaire")
public class CommentaireCtrl {

	CommentaireService comServ;

	public CommentaireCtrl(CommentaireService comServ) {
		super();
		this.comServ = comServ;
	}
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok().body(comServ.getAll());
	}
	
}
