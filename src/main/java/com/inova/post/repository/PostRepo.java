package com.inova.post.repository;

import com.inova.post.entity.Post;
import com.inova.post.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post,Long> {
    Page<Post> findByUser(User user, Pageable pageable);
}
