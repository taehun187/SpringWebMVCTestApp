package com.taehun.service;

import java.util.List;

import com.taehun.entity.Comment;
import com.taehun.entity.Post;
//import com.taehun.service.impl.CommentCallbackImpl;

public interface CommentService extends EntityService<Comment, EntityCallback<Comment>>{

	List<Comment> findAllCommentsByPost(Post post, final EntityCallback<Comment> callback);	
}