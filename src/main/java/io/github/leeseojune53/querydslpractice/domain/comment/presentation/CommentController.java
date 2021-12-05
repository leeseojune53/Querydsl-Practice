package io.github.leeseojune53.querydslpractice.domain.comment.presentation;

import javax.validation.Valid;

import io.github.leeseojune53.querydslpractice.domain.comment.presentation.dto.request.PostCommentRequest;
import io.github.leeseojune53.querydslpractice.domain.comment.service.PostCommentService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentController {

	private final PostCommentService postCommentService;

	@PostMapping("/comment")
	@ResponseStatus(HttpStatus.CREATED)
	public void postComment(@RequestBody @Valid PostCommentRequest request) {
		postCommentService.execute(request);
	}

}
