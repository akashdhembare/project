package com.webcorestone.DMS.daoI;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.DMS.model.LoginDetails;

@Repository
public interface LoginDao extends JpaRepository<LoginDetails, Integer>
{

	//public LoginDetails findAllByLoginUserNameAndLoginPassword(String loginUserName, String loginPassword);

	public LoginDetails findAllByLoginUserNameAndLoginPassword(String loginUserName, String loginPassword);

	
	

}
