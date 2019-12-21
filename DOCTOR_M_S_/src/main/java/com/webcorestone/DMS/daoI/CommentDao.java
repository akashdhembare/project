package com.webcorestone.DMS.daoI;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webcorestone.DMS.model.Comment;

public interface CommentDao extends JpaRepository<Comment, Integer>{
	

}
