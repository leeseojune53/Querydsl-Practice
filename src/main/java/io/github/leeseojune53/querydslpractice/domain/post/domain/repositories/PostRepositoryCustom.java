package io.github.leeseojune53.querydslpractice.domain.post.domain.repositories;

import io.github.leeseojune53.querydslpractice.domain.post.domain.Post;

public interface PostRepositoryCustom {
	Post getPostById(Long id);
}
