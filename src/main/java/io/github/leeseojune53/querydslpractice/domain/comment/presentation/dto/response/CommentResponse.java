package io.github.leeseojune53.querydslpractice.domain.comment.presentation.dto.response;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import io.github.leeseojune53.querydslpractice.domain.comment.domain.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class CommentResponse {

	private final List<CommentDto> response;

	@Getter
	@AllArgsConstructor
	public static class CommentDto{
		private final String content;
		private final LocalDateTime lastModifiedTime;
	}

	public CommentResponse(List<Comment> list) {
		this.response = new ArrayList<>();
		for(Comment comment : list) {
			response.add(new CommentDto(comment.getContent(), comment.getModifiedAt()));
		}
	}

}
