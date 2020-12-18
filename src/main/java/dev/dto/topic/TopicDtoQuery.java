package dev.dto.topic;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;


import com.sun.istack.NotNull;

public class TopicDtoQuery {

//{
//	"id":1,
//	"titre":"monTitreDeTopic",
//	"categoriesId":[],
//	"postsid":[],
//	"datecreation":null,
//	"dernierPostId"null:,
//}

	
	
	
	private Integer id;
	@NotEmpty
	@NotNull
	private String titre;
	private List<Integer> categoriesId;
	private List<Integer> postsid;
	private LocalDateTime datecreation;
	private Integer dernierPostId;

	

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

	public List<Integer> getCategoriesId() {
		return categoriesId;
	}

	public void setCategoriesId(List<Integer> categoriesId) {
		this.categoriesId = categoriesId;
	}

	public List<Integer> getPostsid() {
		return postsid;
	}

	public void setPostsid(List<Integer> postsid) {
		this.postsid = postsid;
	}

	public LocalDateTime getDatecreation() {
		return datecreation;
	}

	public void setDatecreation(LocalDateTime datecreation) {
		this.datecreation = datecreation;
	}

	public Integer getDernierPostId() {
		return dernierPostId;
	}

	public void setDernierPostId(Integer dernierPostId) {
		this.dernierPostId = dernierPostId;
	}

}
