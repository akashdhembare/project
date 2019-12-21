package com.webcorestone.DMS.serviceI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.DMS.model.Comment;
import com.webcorestone.DMS.model.LikeDetails;
import com.webcorestone.DMS.model.LoginDetails;
import com.webcorestone.DMS.model.NursDetails;
import com.webcorestone.DMS.model.StudentDetails;
import com.webcorestone.DMS.model.postDetails;
import com.webcorestone.DMS.serviceImpl.NursServiceImpl;


public interface NursServiceI {

	
	public NursDetails register( NursDetails n);
	
	public void delete(int id);
	
	public void update( NursDetails n);

	public LoginDetails login(String loginUserName, String loginPassword);
	
	 public NursDetails getNurse(int id);
	 
	 public postDetails Like(int pId);

	public LikeDetails LikeCount(LikeDetails ldd);

	public postDetails UnLike(int pId);

	public LikeDetails UnLikeCount(LikeDetails ldd);

	public void comment(Comment c);

	public postDetails getpost(int pId);

	public void savecomment(Comment c);

	public void addpost(postDetails ps);

	

	public void savelikedata(LikeDetails ldd);
	
	public void savepost(postDetails pda);

	public postDetails viewpost(int pId);


}
