package com.unisocial.app.business.entity;
import java.util.Collection;


public class Comunity {
private String name;
private String purposeTxt;
private String welcomeMsg;
private Profile myProfile;
private Collection myContentItem;
private Collection myBlogs;
private Collection mySubjects;
private Collection myEvents;
private Collection myNewsletters;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPurposeTxt() {
	return purposeTxt;
}
public void setPurposeTxt(String purposeTxt) {
	this.purposeTxt = purposeTxt;
}
public String getWelcomeMsg() {
	return welcomeMsg;
}
public void setWelcomeMsg(String welcomeMsg) {
	this.welcomeMsg = welcomeMsg;
}
public Collection getMyContentItem() {
	return myContentItem;
}
public void setMyContentItem(Collection myContentItem) {
	this.myContentItem = myContentItem;
}
public Profile getMyProfile() {
	return myProfile;
}
public void setMyProfile(Profile myProfile) {
	this.myProfile = myProfile;
}
public Collection getMyBlogs() {
	return myBlogs;
}
public void setMyBlogs(Collection myBlogs) {
	this.myBlogs = myBlogs;
}
public Collection getMySubjects() {
	return mySubjects;
}
public void setMySubjects(Collection mySubjects) {
	this.mySubjects = mySubjects;
}
public Collection getMyEvents() {
	return myEvents;
}
public void setMyEvents(Collection myEvents) {
	this.myEvents = myEvents;
}
public Collection getMyNewsletters() {
	return myNewsletters;
}
public void setMyNewsletters(Collection myNewsletters) {
	this.myNewsletters = myNewsletters;
}

	
	
}
