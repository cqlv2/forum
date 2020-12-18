package dev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.entity.Categorie;
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
}
