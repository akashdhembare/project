package com.webcorestone.DMS.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class LikeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	private int lcount;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
	private Date date;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public int getLcount() {
		return lcount;
	}

	public void setLcount(int lcount) {
		this.lcount = lcount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
