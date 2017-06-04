package com.cts.bankmanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTION_DETAILS")
public class TransactionDetail implements Serializable {

	private static final long serialVersionUID = 1898989899899L;

	@Id
	@Column(name = "ACCOUNT_NUMBER")
	private Long accountNumber;

	@Column(name = "TRANSACTION_ID")
	private Long transactionId;

	@Column(name = "ACCOUNT_HOLDER_NAME")
	private String customerName;

	@Column(name = "TRANSACTION_TYPE")
	private String transactionType;
	
	@Column(name = "TRANSACTION_AMOUNT")
	private Double transactionAmount;
	
	@Column(name = "DESCRIPTION")
	private String description;

	public Long getAccountNumber1() {
		return accountNumber;
	}
	
	

	public TransactionDetail() {
		super();
		// TODO Auto-generated constructor stub
	}



	public TransactionDetail(Long accountNumber, Long transactionId, String customerName, String transactionType,
			Double transactionAmount, String description) {
		super();
		this.accountNumber = accountNumber;
		this.transactionId = transactionId;
		this.customerName = customerName;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
		this.description = description;
	}


	public Long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public Long getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public Double getTransactionAmount() {
		return transactionAmount;
	}


	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "TransactionDetail [accountNumber=" + accountNumber + ", transactionId=" + transactionId
				+ ", customerName=" + customerName + ", transactionType=" + transactionType + ", transactionAmount="
				+ transactionAmount + ", description=" + description + "]";
	}
}