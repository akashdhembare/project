
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

@Entity
public class AdminDetails {

   public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminFirstName() {
		return adminFirstName;
	}

	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}

	public String getAdminLastName() {
		return adminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

	public String getAdminEmailId() {
		return adminEmailId;
	}

	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

	public long getAdminAadharNo() {
		return adminAadharNo;
	}

	public void setAdminAadharNo(long adminAadharNo) {
		this.adminAadharNo = adminAadharNo;
	}

	public String getAdminPanNo() {
		return adminPanNo;
	}

	public void setAdminPanNo(String adminPanNo) {
		this.adminPanNo = adminPanNo;
	}

	

    public Date getAdminDob() {
		return adminDob;
	}

	public void setAdminDob(Date adminDob) {
		this.adminDob = adminDob;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	private String adminFirstName;
	private String adminLastName;
	private String adminEmailId;
	private String adminContact;
	private long adminAadharNo;
	private String adminPanNo;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date adminDob;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoginDetails login;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<EmployeeDetails> employee = new LinkedHashSet<EmployeeDetails>();

	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails address;

	public LoginDetails getLogin() {
		return login;
	}

	public void setLogin(LoginDetails login) {
		this.login = login;
	}

	public Set<EmployeeDetails> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<EmployeeDetails> employee) {
		this.employee = employee;
	}

	public AddressDetails getAddress() {
		return address;
	}

	public void setAddress(AddressDetails address) {
		this.address = address;
	}
	
}
