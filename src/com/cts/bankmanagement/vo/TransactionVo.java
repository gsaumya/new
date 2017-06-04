package com.cts.bankmanagement.vo;

public class TransactionVo {

	@Override
	public String toString() {
		return "TransactionVo [accountNumber=" + accountNumber + ", transactionId=" + transactionId + ", customerName="
				+ customerName + ", transactionType=" + transactionType + ", transactionAmount=" + transactionAmount
				+ ", description=" + description + "]";
	}


	private Long accountNumber;
	private Long transactionId;
	private String customerName;
	private String transactionType;
	private Double transactionAmount;
	private String description;
	
	
	public TransactionVo() {
		// TODO Auto-generated constructor stub
	}


	public TransactionVo(Long accountNumber, Long transactionId, String customerName, String transactionType,
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


	


	


	
	
	
}
