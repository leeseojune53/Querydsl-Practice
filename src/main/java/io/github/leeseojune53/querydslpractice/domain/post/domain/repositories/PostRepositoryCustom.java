package io.github.leeseojune53.querydslpractice.domain.post.domain.repositories;

import java.util.List;

import io.github.leeseojune53.querydslpractice.domain.comment.domain.Comment;
import io.github.leeseojune53.querydslpractice.domain.post.domain.Post;

public interface PostRepositoryCustom {
	Post getPostById(Long id);
	List<Comment> getCommentById(Long id);
}
