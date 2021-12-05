package io.github.leeseojune53.querydslpractice.domain.post.domain.repositories;

import com.querydsl.jpa.impl.JPAQueryFactory;
import io.github.leeseojune53.querydslpractice.domain.post.domain.Post;
import lombok.RequiredArgsConstructor;

import static io.github.leeseojune53.querydslpractice.domain.post.domain.QPost.post;

@RequiredArgsConstructor
public class PostRepositoryCustomImpl implements PostRepositoryCustom {

	private final JPAQueryFactory query;

	@Override
	public Post getPostById(Long id) {
		Post result = query.selectFrom(post)
				.where(post.id.eq(id))
				.fetchFirst();
		if(result == null)
			throw new RuntimeException("post not found");

		return result;
	}
}
