package io.github.leeseojune53.querydslpractice.domain.comment.service;

import io.github.leeseojune53.querydslpractice.domain.comment.domain.repositories.CommentRepository;
import io.github.leeseojune53.querydslpractice.domain.comment.presentation.dto.response.CommentResponse;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QueryCommentService {

	private final CommentRepository commentRepository;

	public CommentResponse execute() {
		return new CommentResponse(commentRepository.getAll());
	}

}
