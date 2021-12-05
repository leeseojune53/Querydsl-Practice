package io.github.leeseojune53.querydslpractice.domain.comment.domain.repositories;

import java.util.List;

import io.github.leeseojune53.querydslpractice.domain.comment.domain.Comment;

public interface CommentRepositoryCustom {
	List<Comment> getAll();
}
