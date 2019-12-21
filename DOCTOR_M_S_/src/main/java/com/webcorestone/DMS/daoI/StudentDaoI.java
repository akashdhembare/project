package com.webcorestone.DMS.daoI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.DMS.model.StudentDetails;

@Repository
public interface StudentDaoI extends JpaRepository<StudentDetails, Integer> 
{

	
}
