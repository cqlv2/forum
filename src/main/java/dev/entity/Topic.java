package dev.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Topic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	@ManyToMany
	@JoinTable(name = "topic_cat", joinColumns = @JoinColumn(name = "id_Topic"), inverseJoinColumns = @JoinColumn(name = "id_cat"))
	private List<Categorie> categorie;
	@OneToMany
	private List<Post> posts;
	private LocalDateTime datecreation;
	@OneToOne
	private Post dernierPost;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public List<Categorie> getCategorie() {
		return categorie;
	}

	public void setCategorie(List<Categorie> categorie) {
		this.categorie = categorie;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPost(List<Post> posts) {
		this.posts = posts;
	}

	public LocalDateTime getDatecreation() {
		return datecreation;
	}

	public void setDatecreation(LocalDateTime datecreation) {
		this.datecreation = datecreation;
	}

	public Post getDernierPost() {
		return dernierPost;
	}

	public void setDernierPost(Post dernierPost) {
		this.dernierPost = dernierPost;
	}

}
