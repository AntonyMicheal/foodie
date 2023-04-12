package com.ust.foodieApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.foodieApp.dao.RoleDao;
import com.ust.foodieApp.entity.Role;

@Service
public class RoleService {

	
	@Autowired
   private RoleDao roleDao;
	
	public Role createNewRole(Role role) {
		
		return roleDao.save(role);
		
		
	}
	
	public List<Role> getRoles() {

		return roleDao.findAll();

	}
}
