package com.ust.foodieApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.foodieApp.entity.JwtRequest;
import com.ust.foodieApp.entity.JwtResponse;
import com.ust.foodieApp.service.JwtAuthenticationService;


@RestController
public class JwtController {
	
	
	@Autowired
	private JwtAuthenticationService jwtAuthenticationService;
	
	
	@PostMapping("/authenticate")
	public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
		
		return jwtAuthenticationService.createJwtToken(jwtRequest);
	}
	

}
