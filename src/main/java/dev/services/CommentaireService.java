package dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.Commentaire;
import dev.entity.Commentaire;
import dev.exception.repoException;
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

	public Commentaire getById(Integer id) throws repoException {

		Optional<Commentaire> t = comRepo.findById(id);
		if (t.isPresent()) {
			return t.get();
		} else
			throw new repoException("id inconnu");
	}

	public Commentaire addUpdate(Commentaire t) {
		comRepo.save(t);
		return t;
	}

	public boolean remove(int id) throws repoException {
		Commentaire t=this.getById(id);
		comRepo.delete(t);
		return true;
	}
}
