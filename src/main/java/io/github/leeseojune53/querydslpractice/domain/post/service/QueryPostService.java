package io.github.leeseojune53.querydslpractice.domain.post.service;

import io.github.leeseojune53.querydslpractice.domain.post.domain.Post;
import io.github.leeseojune53.querydslpractice.domain.post.domain.repositories.PostRepository;
import io.github.leeseojune53.querydslpractice.domain.post.presentation.dto.response.QueryPostResponse;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QueryPostService {

	private final PostRepository postRepository;

	public QueryPostResponse execute(Long id) {
		Post post = postRepository.getPostById(id);
		return new QueryPostResponse(post.getContent(),
				postRepository.getCommentById(id));
	}

}
