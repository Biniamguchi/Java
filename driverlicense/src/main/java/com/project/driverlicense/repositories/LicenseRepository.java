package com.project.driverlicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.drivers.models.License;

@Repository 												
public interface LicenseRepository extends CrudRepository<License,Long>{
	
}

