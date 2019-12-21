package com.webcorestone.DMS.model;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class DoctorDetails 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;
	private String doctorFirstName;
	private String doctorLastName;
	private String doctorEmail;
	
	private String doctorSpecialization;
	private String doctorContact;
	private String doctorEducationDetail;
	private String gender;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date doctorDob;
	
	private String doctorType;
	private String doctorWorkLocation;

	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails addressDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoginDetails loginDetails;
	
	
	public AddressDetails getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}
	public LoginDetails getLoginDetails() {
		return loginDetails;
	}
	public void setLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorFirstName() {
		return doctorFirstName;
	}
	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}
	public String getDoctorLastName() {
		return doctorLastName;
	}
	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}
	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}
	public String getDoctorContact() {
		return doctorContact;
	}
	public void setDoctorContact(String doctorContact) {
		this.doctorContact = doctorContact;
	}
	public String getDoctorEducationDetail() {
		return doctorEducationDetail;
	}
	public void setDoctorEducationDetail(String doctorEducationDetail) {
		this.doctorEducationDetail = doctorEducationDetail;
	}
	public Date getDoctorDob() {
		return doctorDob;
	}
	public void setDoctorDob(Date doctorDob) {
		this.doctorDob = doctorDob;
	}
	public String getDoctorType() {
		return doctorType;
	}
	public void setDoctorType(String doctorType) {
		this.doctorType = doctorType;
	}
	public String getDoctorWorkLocation() {
		return doctorWorkLocation;
	}
	public void setDoctorWorkLocation(String doctorWorkLocation) {
		this.doctorWorkLocation = doctorWorkLocation;
	}
}
