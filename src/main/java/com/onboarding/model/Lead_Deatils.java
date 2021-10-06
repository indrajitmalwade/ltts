package com.onboarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "lead_details")
public class Lead_Deatils {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column
	private long id;
	@Column
	@NotNull
	private long Agent_Details_id;
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

	public Lead_Deatils() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAgent_Details_id() {
		return Agent_Details_id;
	}

	public void setAgent_Details_id(long agent_Details_id) {
		Agent_Details_id = agent_Details_id;
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
