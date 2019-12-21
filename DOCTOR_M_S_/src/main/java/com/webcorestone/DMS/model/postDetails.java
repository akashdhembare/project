package com.webcorestone.DMS.model;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class postDetails 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	public LikeDetails getLike() {
		return like;
	}
	public void setLike(LikeDetails like) {
		this.like = like;
	}
	public Set<Comment> getCom() {
		return com;
	}
	public void setCom(Set<Comment> com) {
		this.com = com;
	}
	
	private String pText;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
	private Date pdate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LikeDetails like;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Comment> com=new LinkedHashSet<Comment>();
	
	
	
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpText() {
		return pText;
	}
	public void setpText(String pText) {
		this.pText = pText;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	
	
}
