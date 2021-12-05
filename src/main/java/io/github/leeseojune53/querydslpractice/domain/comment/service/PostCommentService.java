package io.github.leeseojune53.querydslpractice.domain.comment.service;

import io.github.leeseojune53.querydslpractice.domain.comment.domain.Comment;
import io.github.leeseojune53.querydslpractice.domain.comment.domain.repositories.CommentRepository;
import io.github.leeseojune53.querydslpractice.domain.comment.presentation.dto.request.PostCommentRequest;
import io.github.leeseojune53.querydslpractice.domain.post.domain.Post;
import io.github.leeseojune53.querydslpractice.domain.post.domain.repositories.PostRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostCommentService {

	private final CommentRepository commentRepository;
	private final PostRepository postRepository;

	public void execute(PostCommentRequest request) {
		Post post = postRepository.getById(request.getPostId());
		commentRepository.save(
				Comment.builder()
				.content(request.getContent())
				.post(post)
				.build()
		);
	}

}
