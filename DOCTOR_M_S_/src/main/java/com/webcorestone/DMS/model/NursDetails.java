package com.webcorestone.DMS.model;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Entity
public class NursDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nursId;
	private String nursFirstName;
	private String nursLastName;
	private String nursEmail;
	private String nursSpecialization;
	private String nursContact;
	private String nursEducationDetail;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
	private Date nursDob;
	private String nursType;
	private String nursWorkLocation;
	
	@OneToOne(cascade =CascadeType.ALL)
	private AddressDetails address;
	@OneToOne(cascade =CascadeType.ALL)
	private LoginDetails login;
	
	
	
	
	public AddressDetails getAddress() {
		return address;
	}
	public void setAddress(AddressDetails address) {
		this.address = address;
	}
	public LoginDetails getLogin() {
		return login;
	}
	public void setLogin(LoginDetails login) {
		this.login = login;
	}
	public int getNursId() {
		return nursId;
	}
	public void setNursId(int nursId) {
		this.nursId = nursId;
	}
	public String getNursFirstName() {
		return nursFirstName;
	}
	public void setNursFirstName(String nursFirstName) {
		this.nursFirstName = nursFirstName;
	}
	public String getNursLastName() {
		return nursLastName;
	}
	public void setNursLastName(String nursLastName) {
		this.nursLastName = nursLastName;
	}
	public String getNursEmail() {
		return nursEmail;
	}
	public void setNursEmail(String nursEmail) {
		this.nursEmail = nursEmail;
	}
	public String getNursSpecialization() {
		return nursSpecialization;
	}
	public void setNursSpecialization(String nursSpecialization) {
		this.nursSpecialization = nursSpecialization;
	}
	public String getNursContact() {
		return nursContact;
	}
	public void setNursContact(String nursContact) {
		this.nursContact = nursContact;
	}
	public String getNursEducationDetail() {
		return nursEducationDetail;
	}
	public void setNursEducationDetail(String nursEducationDetail) {
		this.nursEducationDetail = nursEducationDetail;
	}
	public Date getNursDob() {
		return nursDob;
	}
	public void setNursDob(Date nursDob) {
		this.nursDob = nursDob;
	}
	public String getNursType() {
		return nursType;
	}
	public void setNursType(String nursType) {
		this.nursType = nursType;
	}
	public String getNursWorkLocation() {
		return nursWorkLocation;
	}
	public void setNursWorkLocation(String nursWorkLocation) {
		this.nursWorkLocation = nursWorkLocation;
	}
}
