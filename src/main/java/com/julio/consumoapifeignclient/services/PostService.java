package com.julio.consumoapifeignclient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julio.consumoapifeignclient.feignclients.PostFeignClient;
import com.julio.consumoapifeignclient.model.Post;

@Service
public class PostService {
	
	@Autowired
	private PostFeignClient postFeignClient;

	public List<Post> findAll() {
		return postFeignClient.findAll();
	}

	public Post findById(String id) {
		return postFeignClient.findById(id);
	}

	public Post save(Post post) {
		return postFeignClient.save(post);
	}

	public Post edit(Post post) {
		return postFeignClient.edit(String.valueOf(post.getId()), post);
	}

	public void delete(String id) {
		postFeignClient.delete(id);
		
	}

}
