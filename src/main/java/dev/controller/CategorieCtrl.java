package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.services.CategorieService;
import dev.services.TopicService;

@RestController
@CrossOrigin
@RequestMapping("categorie")
public class CategorieCtrl {

	private CategorieService catServ;

	public CategorieCtrl(CategorieService catServ) {
		super();
		this.catServ = catServ;
	}
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok().body(catServ.getAll());
	}
	
}
