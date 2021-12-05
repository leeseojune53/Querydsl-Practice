package io.github.leeseojune53.querydslpractice.domain.comment.presentation;

import javax.validation.Valid;

import io.github.leeseojune53.querydslpractice.domain.comment.presentation.dto.request.PostCommentRequest;
import io.github.leeseojune53.querydslpractice.domain.comment.presentation.dto.response.CommentResponse;
import io.github.leeseojune53.querydslpractice.domain.comment.service.PostCommentService;
import io.github.leeseojune53.querydslpractice.domain.comment.service.QueryCommentService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {

	private final PostCommentService postCommentService;
	private final QueryCommentService queryCommentService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void postComment(@RequestBody @Valid PostCommentRequest request) {
		postCommentService.execute(request);
	}

	@GetMapping
	public CommentResponse queryComments() {
		return queryCommentService.execute();
	}

}
