package com.ust.foodieApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.foodieApp.entity.Role;


@Repository
public interface RoleDao extends JpaRepository<Role, String>{

	
	
}
