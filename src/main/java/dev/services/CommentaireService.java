package dev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.entity.Commentaire;
import dev.repositories.CommentaireRepository;

@Service
public class CommentaireService {

	CommentaireRepository comRepo;

	public CommentaireService(CommentaireRepository comRepo) {
		super();
		this.comRepo = comRepo;
	}

	public List<Commentaire> getAll() {
		return comRepo.findAll();
	}
}
