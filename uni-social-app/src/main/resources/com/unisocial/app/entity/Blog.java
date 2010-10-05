package com.unisocial.app.business.entity;
import java.util.Collection;


public class Blog {

	private String name;
	private String detail;
	private Collection myPostCollection;
	
	
	
	
	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getDetail() {
		return detail;
	}





	public void setDetail(String detail) {
		this.detail = detail;
	}





	public Collection getMyPostCollection() {
		return myPostCollection;
	}





	public void setMyPostCollection(Collection myPostCollection) {
		this.myPostCollection = myPostCollection;
	}





	public Post createPost(String t){
		
		Post result= new Post();
		((Post)result).setText(t);
		return result;
	}
	
	
	
}
