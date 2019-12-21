package com.webcorestone.DMS.model;

import java.sql.Date;
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

@Entity
public class EmployeeDetails
{

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int employeeId;
private String employeeFirstName;
private String employeeLastName;
private String employeeEmailId;
private String employeeContact;
private long employeeAadharNo;
private String employeePanNo;
private double employeeSalary;

@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
private Date employeeDob;

@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
private Date employeeJoiningDate;

@OneToOne(cascade = CascadeType.ALL)
private AddressDetails address;



public AddressDetails getAddress() {
	return address;
}
public void setAddress(AddressDetails address) {
	this.address = address;
}
@OneToOne(cascade = CascadeType.ALL)
private LoginDetails login;

public LoginDetails getLogin() {
	return login;
}
public void setLogin(LoginDetails login) {
	this.login = login;
}
@OneToMany(cascade = CascadeType.ALL)
private Set<DoctorDetails> doctor=new LinkedHashSet<DoctorDetails>();

@OneToMany(cascade = CascadeType.ALL)
private Set<StudentDetails> student=new LinkedHashSet<StudentDetails>();

@OneToMany(cascade = CascadeType.ALL)
private Set<NursDetails> nurs=new LinkedHashSet<NursDetails>();



public Set<DoctorDetails> getDoctor() {
	return doctor;
}
public void setDoctor(Set<DoctorDetails> doctor) {
	this.doctor = doctor;
}
public Set<StudentDetails> getStudent() {
	return student;
}
public void setStudent(Set<StudentDetails> student) {
	this.student = student;
}
public Set<NursDetails> getNurs() {
	return nurs;
}
public void setNurs(Set<NursDetails> nurs) {
	this.nurs = nurs;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeFirstName() {
	return employeeFirstName;
}
public void setEmployeeFirstName(String employeeFirstName) {
	this.employeeFirstName = employeeFirstName;
}
public String getEmployeeLastName() {
	return employeeLastName;
}
public void setEmployeeLastName(String employeeLastName) {
	this.employeeLastName = employeeLastName;
}
public String getEmployeeEmailId() {
	return employeeEmailId;
}
public void setEmployeeEmailId(String employeeEmailId) {
	this.employeeEmailId = employeeEmailId;
}
public String getEmployeeContact() {
	return employeeContact;
}
public void setEmployeeContact(String employeeContact) {
	this.employeeContact = employeeContact;
}
public long getEmployeeAadharNo() {
	return employeeAadharNo;
}
public void setEmployeeAadharNo(long employeeAadharNo) {
	this.employeeAadharNo = employeeAadharNo;
}
public String getEmployeePanNo() {
	return employeePanNo;
}
public void setEmployeePanNo(String employeePanNo) {
	this.employeePanNo = employeePanNo;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public Date getEmployeeDob() {
	return employeeDob;
}
public void setEmployeeDob(Date employeeDob) {
	this.employeeDob = employeeDob;
}
public Date getEmployeeJoiningDate() {
	return employeeJoiningDate;
}
public void setEmployeeJoiningDate(Date employeeJoiningDate) {
	this.employeeJoiningDate = employeeJoiningDate;
}

}
