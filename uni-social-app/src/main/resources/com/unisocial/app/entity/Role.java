package com.unisocial.app.business.entity;

public class Role {

	
	private String position;
	private int expertiseLevel;
	private String roleDescription;
	 private Skill mySkill;
	
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getExpertiseLevel() {
		return expertiseLevel;
	}
	public void setExpertiseLevel(int expertiseLevel) {
		this.expertiseLevel = expertiseLevel;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	public Skill getMySkill() {
		return mySkill;
	}
	public void setMySkill(Skill mySkill) {
		this.mySkill = mySkill;
	}
	
	
	
	
	
	
}
