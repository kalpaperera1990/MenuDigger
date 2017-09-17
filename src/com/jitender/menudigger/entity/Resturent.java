package com.jitender.menudigger.entity;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Resturent {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	Long id;	
	@Persistent
	String restName;
	@Persistent
	String restAddress;
	@Persistent
	String [] restMenu;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getrestName() {
		return restName;
	}

	public void setrestName(String restName) {
		this.restName = restName;
	}
	
	public String getrestAddress(){
		return restAddress;
	}
	
	public void setrestAddress(String restAddress){
		this.restAddress = restAddress;
	}
	
	public String [] getrestMenu(){
		return restMenu;
	}
	
	public void setrestMenu(String [] restMenu){
		this.restMenu = restMenu;
	}
}
