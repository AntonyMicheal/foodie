package com.ust.foodieApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Role {

@Id
@JsonProperty("roleName")
private String roleName;

private String roleDescription;

public String getRoleName() {
	return roleName;
}

public void setRoleName(String roleName) {
	this.roleName = roleName;
}

public String getRoleDescription() {
	return roleDescription;
}

public void setRoleDescription(String roleDescription) {
	this.roleDescription = roleDescription;
}



}
