package dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entity.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}
