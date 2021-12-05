package io.github.leeseojune53.querydslpractice.domain.comment.domain.repositories;

import io.github.leeseojune53.querydslpractice.domain.comment.domain.Comment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long>, CommentRepositoryCustom {
}
