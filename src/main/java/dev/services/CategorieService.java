package dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.Categorie;
import dev.entity.Categorie;
import dev.exception.repoException;
import dev.repositories.CategorieRepository;

@Service
public class CategorieService {

	private CategorieRepository catRepo;

	public CategorieService(CategorieRepository catRepo) {
		super();
		this.catRepo = catRepo;
	}

	public List<Categorie> getAll() {
		return catRepo.findAll();
	}

	public Categorie getById(Integer id) throws repoException {

		Optional<Categorie> t = catRepo.findById(id);
		if (t.isPresent()) {
			return t.get();
		} else
			throw new repoException("id inconnu");
	}

	public Categorie addUpdate(Categorie t) {
		catRepo.save(t);
		return t;
	}

	public boolean remove(int id) throws repoException {
		Categorie t=this.getById(id);
		catRepo.delete(t);
		return true;
	}
}
