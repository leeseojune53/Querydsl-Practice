package io.github.leeseojune53.querydslpractice.domain.comment.presentation.dto.request;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostCommentRequest {

	@NotNull(message = "postid는 null이면 안됩니다.")
	private Long postId;

	@NotNull(message = "content는 null이면 안됩니다.")
	private String content;

}
