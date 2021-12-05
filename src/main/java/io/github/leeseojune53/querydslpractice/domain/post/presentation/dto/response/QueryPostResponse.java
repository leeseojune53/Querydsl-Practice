package io.github.leeseojune53.querydslpractice.domain.post.presentation.dto.response;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import io.github.leeseojune53.querydslpractice.domain.comment.domain.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class QueryPostResponse {

	private final String content;

	private final List<CommentDto> comments;

	@Getter
	@AllArgsConstructor
	public static class CommentDto{
		private final String content;
		private final LocalDateTime lastModifiedTime;
	}

	public QueryPostResponse(String content, List<Comment> list) {
		this.content = content;
		this.comments = new ArrayList<>();
		for(Comment comment : list) {
			comments.add(new CommentDto(comment.getContent(), comment.getModifiedAt()));
		}
	}

}
