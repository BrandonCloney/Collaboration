package com.collab.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="blog_details")
public class Blog implements Serializable {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int blogid;
	
	@Column
	private String blogtitle;
	
	@Lob
	@Column
	private String blogdesc;
	
	@Column
	private String userId;
	
	
	
	public int getId() {
		return blogid;
	}



	public void setId(int id) {
		this.blogid = id;
	}



	public String getBlogtitle() {
		return blogtitle;
	}



	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}



	public String getBlogdesc() {
		return blogdesc;
	}



	public void setBlogdesc(String blogdesc) {
		this.blogdesc = blogdesc;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	private static final long serialVersionUID = 1L;

}
