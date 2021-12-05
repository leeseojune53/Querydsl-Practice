package io.github.leeseojune53.querydslpractice.domain.post.service;

import io.github.leeseojune53.querydslpractice.domain.post.domain.Post;
import io.github.leeseojune53.querydslpractice.domain.post.domain.repositories.PostRepository;
import io.github.leeseojune53.querydslpractice.domain.post.presentation.dto.request.PostRequest;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

	private final PostRepository postRepository;

	public void execute(PostRequest request) {
		postRepository.save(
				Post.builder()
				.content(request.getContent())
				.build()
		);
	}

}
