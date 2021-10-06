package com.onboarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "Merchant")
public class Merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long Merchant_id;
	@Column
	private String Token;
	@Column
	private String CreatedDate;
	@Column
	private String UpdatedDate;

	public Merchant() {

	}

	public long getMerchant_id() {
		return Merchant_id;
	}

	public void setMerchant_id(long merchant_id) {
		Merchant_id = merchant_id;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public String getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(String createdDate) {
		CreatedDate = createdDate;
	}

	public String getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		UpdatedDate = updatedDate;
	}

}
