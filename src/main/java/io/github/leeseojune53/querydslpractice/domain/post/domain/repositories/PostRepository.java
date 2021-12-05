package io.github.leeseojune53.querydslpractice.domain.post.domain.repositories;

import io.github.leeseojune53.querydslpractice.domain.post.domain.Post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
