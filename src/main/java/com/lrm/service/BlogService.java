package com.lrm.service;

import com.lrm.po.Blog;
import com.lrm.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {
    public Blog getBlog(Long id);
    public Page<Blog> listBlog(Pageable pageable, BlogQuery blog);
    public Page<Blog> listBlog(Pageable pageable);
    public Page<Blog>listBlog(String query, Pageable pageable);
    public List<Blog> listRecomendBlogTop(Integer size);
    public Blog save(Blog blog);
    public Blog updateBlog(Long id,Blog blog);
    public void remove(Long id);
    Blog getAndConvert(Long id);
    Page<Blog> listBlog(Long id, Pageable pageable);
    Map<String,List<Blog>> archiveBlog();

    Long countBlog();
}
