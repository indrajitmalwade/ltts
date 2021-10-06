package com.onboarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "merchant_address")
public class Merchant_Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column
	private long Merchant_Address_Id;
	@Column
	@NotNull
	private long Merchant_id;
	@Column

	private String Address1;
	@Column
	private String Address2;
	@Column
	private String City;
	@Column
	private String State;
	@Column
	private String Country;
	@Column
	private int postalcode;

	public Merchant_Address() {

	}

	public long getMerchant_Address_Id() {
		return Merchant_Address_Id;
	}

	public void setMerchant_Address_Id(long merchant_Address_Id) {
		Merchant_Address_Id = merchant_Address_Id;
	}

	public long getMerchant_id() {
		return Merchant_id;
	}

	public void setMerchant_id(long merchant_id) {
		Merchant_id = merchant_id;
	}

	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String address1) {
		Address1 = address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String address2) {
		Address2 = address2;
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
