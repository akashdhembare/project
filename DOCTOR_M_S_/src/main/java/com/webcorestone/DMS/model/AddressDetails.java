package com.webcorestone.DMS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AddressDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addressId;
	private String addressVillage;
	private String addressTalName;
	private String addressDistName;
	private String addressStateName;
	private String addressCountryName;
	private int addressZiPcode;
	
	public String getAddressVillage() {
		return addressVillage;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public void setAddressVillage(String addressVillage) {
		this.addressVillage = addressVillage;
	}
	public String getAddressTalName() {
		return addressTalName;
	}
	public void setAddressTalName(String addressTalName) {
		this.addressTalName = addressTalName;
	}
	public String getAddressDistName() {
		return addressDistName;
	}
	public void setAddressDistName(String addressDistName) {
		this.addressDistName = addressDistName;
	}
	public String getAddressStateName() {
		return addressStateName;
	}
	public void setAddressStateName(String addressStateName) {
		this.addressStateName = addressStateName;
	}
	public String getAddressCountryName() {
		return addressCountryName;
	}
	public void setAddressCountryName(String addressCountryName) {
		this.addressCountryName = addressCountryName;
	}
	public int getAddressZiPcode() {
		return addressZiPcode;
	}
	public void setAddressZiPcode(int addressZiPcode) {
		this.addressZiPcode = addressZiPcode;
	}
			
}
