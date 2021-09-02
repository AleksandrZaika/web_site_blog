package com.example.Web_site_blog.repo;

import com.example.Web_site_blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
