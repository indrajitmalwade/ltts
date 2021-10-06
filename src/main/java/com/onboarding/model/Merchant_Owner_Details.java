package com.onboarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "merchant_owner_details")
public class Merchant_Owner_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column
	private long Owner_Details_Id;
	@NotNull
	@Column
	private long Merchant_Id;
	@NotNull
	@Column
	private String FirstName;
	@NotNull
	@Column
	private String LastName;
	@NotNull
	@Column
	private String Email;
	@NotNull
	@Column
	private int phone;
	@NotNull
	@Column
	private String owner_type;
	@NotNull
	@Column
	private float percentage;

	public Merchant_Owner_Details() {

	}

	public long getOwner_Details_Id() {
		return Owner_Details_Id;
	}

	public void setOwner_Details_Id(long owner_Details_Id) {
		Owner_Details_Id = owner_Details_Id;
	}

	public long getMerchant_Id() {
		return Merchant_Id;
	}

	public void setMerchant_Id(long merchant_Id) {
		Merchant_Id = merchant_Id;
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
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getOwner_type() {
		return owner_type;
	}

	public void setOwner_type(String owner_type) {
		this.owner_type = owner_type;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}
