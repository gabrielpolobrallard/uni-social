package com.unisocial.app.business.entity;
import java.util.Date;

public class Message {

	private Date timeStampMsg;
	private String titleMsg;
	private String bodyMsg;

	public Date getTimeStampMsg() {
		return timeStampMsg;
	}

	public void setTimeStampMsg(Date timeStampMsg) {
		this.timeStampMsg = timeStampMsg;
	}

	public String getTitleMsg() {
		return titleMsg;
	}

	public void setTitleMsg(String titleMsg) {
		this.titleMsg = titleMsg;
	}

	public String getBodyMsg() {
		return bodyMsg;
	}

	public void setBodyMsg(String bodyMsg) {
		this.bodyMsg = bodyMsg;
	}

}
