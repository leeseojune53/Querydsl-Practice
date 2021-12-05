package io.github.leeseojune53.querydslpractice.domain.post.domain.repositories;

import java.util.List;

import com.querydsl.jpa.impl.JPAQueryFactory;
import io.github.leeseojune53.querydslpractice.domain.comment.domain.Comment;
import io.github.leeseojune53.querydslpractice.domain.post.domain.Post;
import lombok.RequiredArgsConstructor;

import static io.github.leeseojune53.querydslpractice.domain.comment.domain.QComment.comment;
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

	@Override
	public List<Comment> getCommentById(Long id) {
		return query.selectFrom(comment)
				.leftJoin(comment.post, post)
				.where(post.id.eq(id))
				.fetch();
	}

}
