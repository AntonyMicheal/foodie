package com.ust.foodieApp.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.ust.foodieApp.entity.Role;
import com.ust.foodieApp.service.RoleService;


@RestController
public class RoleController {
	
@Autowired	
private RoleService roleService;

	@PostMapping("/createNewRole")
	public Role createNewRole(@RequestBody Role role) {
		
	return	roleService.createNewRole(role);
	}
	
	@GetMapping("/getRoles")
	public List<String> getRoles() {
		
	List<Role> roles=roleService.getRoles();
	
	return roles.stream().map((role) -> role.getRoleName()).collect(Collectors.toList());
	
	
	}

}
