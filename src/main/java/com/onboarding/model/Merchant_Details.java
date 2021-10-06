package com.onboarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "merchant_details")
public class Merchant_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@NotNull
	private long Merchant_Details_id;
	@Column
	@NotNull
	private long Merchant_id;
	@Column
	@NotNull
	private String FirstName;
	@Column
	@NotNull
	private String LastName;
	@Column
	@NotNull
	private String Email;
	@Column
	@NotNull
	private int Phone;
	@Column
	private int Adhar_Number;
	@Column
	private String Business_Type;
	@Column
	private String Address;
	@Column
	private String City;
	@Column
	private String State;
	@Column
	private String Country;
	@Column
	private int postalcode;

	public Merchant_Details() {

	}

	public long getMerchant_Details_id() {
		return Merchant_Details_id;
	}

	public void setMerchant_Details_id(long merchant_Details_id) {
		Merchant_Details_id = merchant_Details_id;
	}

	public long getMerchant_id() {
		return Merchant_id;
	}

	public void setMerchant_id(long merchant_id) {
		Merchant_id = merchant_id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public int getAdhar_Number() {
		return Adhar_Number;
	}

	public void setAdhar_Number(int adhar_Number) {
		Adhar_Number = adhar_Number;
	}

	public String getBusiness_Type() {
		return Business_Type;
	}

	public void setBusiness_Type(String business_Type) {
		Business_Type = business_Type;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

}
