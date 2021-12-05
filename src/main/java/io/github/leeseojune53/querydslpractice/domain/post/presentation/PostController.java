package io.github.leeseojune53.querydslpractice.domain.post.presentation;

import javax.validation.Valid;

import io.github.leeseojune53.querydslpractice.domain.post.presentation.dto.request.PostRequest;
import io.github.leeseojune53.querydslpractice.domain.post.presentation.dto.response.QueryPostResponse;
import io.github.leeseojune53.querydslpractice.domain.post.service.PostService;
import io.github.leeseojune53.querydslpractice.domain.post.service.QueryPostService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;
	private final QueryPostService queryPostService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void post(@RequestBody @Valid PostRequest request) {
		postService.execute(request);
	}

	@GetMapping
	public QueryPostResponse queryPost(@RequestParam("post_id") Long id) {
		return queryPostService.execute(id);
	}

}
