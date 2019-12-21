package com.webcorestone.DMS.daoI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.DMS.model.LikeDetails;
@Repository
public interface LikeDao extends JpaRepository<LikeDetails, Integer>{
	

}
