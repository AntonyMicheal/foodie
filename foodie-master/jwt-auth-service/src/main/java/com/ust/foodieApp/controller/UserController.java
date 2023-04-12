package com.ust.foodieApp.controller;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.foodieApp.entity.Role;
import com.ust.foodieApp.entity.User;
import com.ust.foodieApp.service.UserService;

@RestController
public class UserController {

	@Autowired
  private UserService userService;

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
    	
    	Set<Role> roles=new LinkedHashSet<>();
    	
    	Role role=new Role();
    	if(user.getRole().equalsIgnoreCase("Admin"))   		
    	{
    		role.setRoleName(user.getRole());
    		role.setRoleDescription("Admin for the App");
    		roles.add(role);
    		user.setRoles(roles);
    		
    	}else if(user.getRole().equalsIgnoreCase("Customer")){
    		
    		role.setRoleName(user.getRole());
    		role.setRoleDescription("Customer for the App");
    		roles.add(role);
    		user.setRoles(roles);
    	}else if(user.getRole().equalsIgnoreCase("Restaurant")){
    		
    		role.setRoleName(user.getRole());
    		role.setRoleDescription("Restaurant for the App");
    		roles.add(role);
    		user.setRoles(roles);
    	}
        return userService.registerNewUser(user);
    }

    
}
