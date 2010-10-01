package com.unisocial.app.business.entity;

import java.util.Collection;
import java.util.Date;

public class Me {
	private String userName;
	private String userPassword;
	private Date subscription;
	private Collection myProfile;
	private Collection myContact;
	private Collection myMessage;
	private Collection myContentItem;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getSubscription() {
		return subscription;
	}
	public void setSubscription(Date subscription) {
		this.subscription = subscription;
	}
	public Collection getMyProfile() {
		return myProfile;
	}
	public void setMyProfile(Collection myProfile) {
		this.myProfile = myProfile;
	}
	public Collection getMyContact() {
		return myContact;
	}
	public void setMyContact(Collection myContact) {
		this.myContact = myContact;
	}
	public Collection getMyMessage() {
		return myMessage;
	}
	public void setMyMessage(Collection myMessage) {
		this.myMessage = myMessage;
	}
	public Collection getMyContentItem() {
		return myContentItem;
	}
	public void setMyContentItem(Collection myContentItem) {
		this.myContentItem = myContentItem;
	}

}
