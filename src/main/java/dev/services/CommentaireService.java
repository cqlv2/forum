package dev.services;

import java.util.List;

import dev.entity.Commentaire;

public class CommentaireService {

	CommentaireRepository comRepo;

	public CommentaireService(CommentaireRepository comRepo) {
		super();
		this.comRepo = comRepo;
	}

	public List<Commentaire> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
