package dev.transformer;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import dev.dto.topic.TopicDtoQuery;
import dev.entity.Categorie;
import dev.entity.Post;
import dev.entity.Topic;
import dev.exception.repoException;
import dev.services.CategorieService;
import dev.services.PostService;

public class TopicTransformer {
	

	@Autowired
	private static CategorieService catServ;
	@Autowired
	private static PostService postServ;
	

	public static Topic dtoToEntity(TopicDtoQuery topicDto) throws repoException {
		Topic t = new Topic();
		if(topicDto.getId()!= null) {
			t.setId(topicDto.getId());
		}
		t.setTitre(topicDto.getTitre());
		for (Integer id : topicDto.getCategoriesId()) {
			t.getCategorie().add(catServ.getById(id));
		}
		for (Integer id : topicDto.getPostsid()) {
			t.getPosts().add(postServ.getById(id));
		}
		
		if(topicDto.getDatecreation()!=null) {
			t.setDatecreation(topicDto.getDatecreation());
		}else {
			t.setDatecreation(LocalDateTime.now()); 
		}
		
		
		
		if(topicDto.getDernierPostId()!=null) {
			t.setDernierPost(postServ.getById(topicDto.getDernierPostId()));
		}
		return t;
	}

	
}
