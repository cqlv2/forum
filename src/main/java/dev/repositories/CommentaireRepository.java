package dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entity.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Integer> {

}
