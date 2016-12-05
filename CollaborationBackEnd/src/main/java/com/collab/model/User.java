package com.collab.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="user_details")
public class User implements Serializable {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String email;
	@Column
	private String address;
	@Column
	private String contact;
	@Column
	private char status;
	@Column
	private String reason;
	@Column
	private char isOnline;
	
	private String role;
	
	@Transient
	private String errorcode;
	@Transient
	private String errormsg;
	
	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}



	public String getErrormsg() {
		return errormsg;
	}



	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}



	public int getId() {
		return userId;
	}



	public void setId(int id) {
		this.userId = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}


	public char getStatus() {
		return status;
	}



	public void setStatus(char status) {
		this.status = status;
	}



	public String getReason() {
		return reason;
	}



	public void setReason(String reason) {
		this.reason = reason;
	}



	public char getIsOnline() {
		return isOnline;
	}



	public void setIsOnline(char isOnline) {
		this.isOnline = isOnline;
	}



	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}



	private static final long serialVersionUID = 1L;

}
