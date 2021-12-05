package io.github.leeseojune53.querydslpractice.domain.comment.domain.repositories;

import java.util.List;

import com.querydsl.jpa.impl.JPAQueryFactory;
import io.github.leeseojune53.querydslpractice.domain.comment.domain.Comment;
import lombok.RequiredArgsConstructor;

import static io.github.leeseojune53.querydslpractice.domain.comment.domain.QComment.comment;

@RequiredArgsConstructor
public class CommentRepositoryCustomImpl implements CommentRepositoryCustom {

	private final JPAQueryFactory query;

	@Override
	public List<Comment> getAll() {
		return query.selectFrom(comment)
				.fetch();
	}
}
