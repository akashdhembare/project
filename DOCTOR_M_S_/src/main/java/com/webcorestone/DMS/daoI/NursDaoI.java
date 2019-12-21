package com.webcorestone.DMS.daoI;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webcorestone.DMS.model.LoginDetails;
import com.webcorestone.DMS.model.NursDetails;

@Repository
public interface NursDaoI extends JpaRepository<NursDetails, Integer>{

	
	 public List findAllByNursId(int idn);
	  
	  @Query("from NursDetails where login_login_id=:id") 
	  public NursDetails getNurse(Integer id);
	 
	
	
	//public List<NursDetails> findAllByLoginUserNameAndLoginPassword(String loginUserName,String loginPassword);

}
