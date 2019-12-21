package com.webcorestone.DMS.daoI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.DMS.model.EmployeeDetails;

@Repository
public interface EmployeeDaoI extends JpaRepository<EmployeeDetails, Integer>{
	
}
