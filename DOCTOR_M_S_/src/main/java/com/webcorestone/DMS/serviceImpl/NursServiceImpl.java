package com.webcorestone.DMS.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.DMS.daoI.CommentDao;
import com.webcorestone.DMS.daoI.LikeDao;
import com.webcorestone.DMS.daoI.LoginDao;
import com.webcorestone.DMS.daoI.NursDaoI;
import com.webcorestone.DMS.daoI.PostDao;
import com.webcorestone.DMS.model.Comment;
import com.webcorestone.DMS.model.LikeDetails;
import com.webcorestone.DMS.model.LoginDetails;
import com.webcorestone.DMS.model.NursDetails;
import com.webcorestone.DMS.model.postDetails;
import com.webcorestone.DMS.serviceI.NursServiceI;

@Service
public class NursServiceImpl implements NursServiceI
{
	@Autowired
	NursDaoI nd;

	@Autowired
	LoginDao ldd;
	
	
	@Autowired
	PostDao pd;
	
	@Autowired
    LikeDao ld;
	
	@Autowired
	CommentDao cd;
	
	public NursDetails register( NursDetails n)
	{
		return nd.save(n);
	}

	@Override
	public void delete(int id) 
{
		nd.deleteById(id);
		
	}

	@Override
	public void update(NursDetails n)
 {
		nd.save(n);
		
	}
	@Override
	public LoginDetails login(String loginUserName, String loginPassword)
	{
		
		return ldd.findAllByLoginUserNameAndLoginPassword(loginUserName, loginPassword);
	}

	
	 @Override public NursDetails getNurse(int id) {
	  
	  return nd.getNurse(id);
	  
	 }

	@Override
	public postDetails Like(int pId) {
		
		return pd.findAllBypId(pId);
	}

	@Override
	public LikeDetails LikeCount(LikeDetails ldd) {
	
		return ld.save(ldd);
	}

	@Override
	public postDetails UnLike(int pId) {
		
		return pd.findAllBypId(pId);
	}

	@Override
	public LikeDetails UnLikeCount(LikeDetails ldd) {
		
		return ld.save(ldd);
	}

	
	  @Override 
	  public void comment(Comment c) {
	  
	  cd.save(c); 
	  }

	@Override
	public postDetails getpost(int pId) {
		
		return pd.findAllBypId(pId);
	}

	@Override
	public void savecomment(Comment c) {
		cd.save(c);
		
	}

	@Override
	public void addpost(postDetails ps) {
		pd.save(ps);
		
	}



	@Override
	public void savelikedata(LikeDetails ldd) {
		ld.save(ldd);
		
	}

	@Override
	public void savepost(postDetails pda) {
		pd.save(pda);
		
	}

	@Override
	public postDetails viewpost(int pId) {
		
		return pd.findAllBypId(pId);
		
	}
	 

	

	}
	 


	

	

	
	

