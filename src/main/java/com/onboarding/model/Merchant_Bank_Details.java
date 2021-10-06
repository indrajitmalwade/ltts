package com.onboarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "merchant_bank_setails")
public class Merchant_Bank_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column
	private long Bank_Details_id;
	@NotNull
	@Column
	private long Merchant_Id;
	@NotNull
	@Column
	private String Bank_Name;
	@NotNull
	@Column
	private long Account_Number;
	@NotNull
	@Column
	private long Confirm_Account_Number;
	@NotNull
	@Column
	private String IFSC_code;

	public Merchant_Bank_Details() {

	}

	public long getBank_Details_id() {
		return Bank_Details_id;
	}

	public void setBank_Details_id(long bank_Details_id) {
		Bank_Details_id = bank_Details_id;
	}

	public long getMerchant_Id() {
		return Merchant_Id;
	}

	public void setMerchant_Id(long merchant_Id) {
		Merchant_Id = merchant_Id;
	}

	public String getBank_Name() {
		return Bank_Name;
	}

	public void setBank_Name(String bank_Name) {
		Bank_Name = bank_Name;
	}

	public long getAccount_Number() {
		return Account_Number;
	}

	public void setAccount_Number(long account_Number) {
		Account_Number = account_Number;
	}

	public long getConfirm_Account_Number() {
		return Confirm_Account_Number;
	}

	public void setConfirm_Account_Number(long confirm_Account_Number) {
		Confirm_Account_Number = confirm_Account_Number;
	}

	public String getIFSC_code() {
		return IFSC_code;
	}

	public void setIFSC_code(String iFSC_code) {
		IFSC_code = iFSC_code;
	}

}
