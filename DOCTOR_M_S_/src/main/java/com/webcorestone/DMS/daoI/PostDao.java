package com.webcorestone.DMS.daoI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webcorestone.DMS.model.postDetails;
@Repository
public interface PostDao extends JpaRepository<postDetails, Integer>{

	@Query("from postDetails where pId=:pId")
	public postDetails findAllBypId(Integer pId);
	

}
