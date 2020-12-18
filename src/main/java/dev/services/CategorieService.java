package dev.services;

import java.util.List;

import dev.entity.Categorie;
import dev.repositories.CategorieRepository;

public class CategorieService {

	private CategorieRepository catRepo;

	public CategorieService(CategorieRepository catRepo) {
		super();
		this.catRepo = catRepo;
	}

	public List<Categorie> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
