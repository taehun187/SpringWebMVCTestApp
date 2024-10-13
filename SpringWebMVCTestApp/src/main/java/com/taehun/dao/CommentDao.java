package com.taehun.dao;

import java.util.List;

import com.taehun.entity.Comment;
import com.taehun.entity.Post;

public interface CommentDao extends Dao<Comment>{

    List<Comment> findAllCommentsByPost(Post post);

}
