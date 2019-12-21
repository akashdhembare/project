package com.webcorestone.DMS.daoI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.DMS.model.AdminDetails;

@Repository
public interface AdminDaoI  extends JpaRepository<AdminDetails, Integer>
{


}
