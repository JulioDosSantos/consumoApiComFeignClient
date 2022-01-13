package com.julio.consumoapifeignclient.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.julio.consumoapifeignclient.model.Post;

@FeignClient(url = "https://jsonplaceholder.typicode.com/posts", name = "posts")
public interface PostFeignClient {

	@GetMapping
	List<Post> findAll();

	@GetMapping("/{id}")
	Post findById(@PathVariable("id") String id);

	@PostMapping
	Post save(@RequestBody Post post);

	@PutMapping("/{id}")
	Post edit(@PathVariable("id") String id, @RequestBody Post post);

	@DeleteMapping("/{id}")
	void delete(@PathVariable("id") String id);


}
