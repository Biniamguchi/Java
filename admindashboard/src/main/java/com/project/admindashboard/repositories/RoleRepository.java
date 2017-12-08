package com.project.admindashboard.repositories;

import com.project.admindashboard.models.Role;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 												
public interface RoleRepository extends CrudRepository<Role,Long>{
    List<Role> findAll();
    
    Role findByName(String name);	
}
