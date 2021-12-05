package io.github.leeseojune53.querydslpractice.domain.post.presentation.dto.request;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostRequest {

	@Size(max = 512, message = "content는 512자 이하여야 합니다.")
	private String content;

}
