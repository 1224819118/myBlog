package com.lrm.service;

import com.lrm.po.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> listCommentByBlogId(Long blogId);
    public Comment save(Comment comment);
}
