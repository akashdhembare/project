package com.webcorestone.DMS.daoI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.DMS.model.DoctorDetails;

@Repository
public interface DoctorDaoI  extends JpaRepository<DoctorDetails, Integer>
{

}
