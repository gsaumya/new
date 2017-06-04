package com.cts.bankmanagement.exception;

public class BankManagementException extends Exception {
	static final long serialVersionUID = -3387516993124229978L;

	public BankManagementException(String message, Throwable cause) {
		super(message, cause);
	}

	public BankManagementException(String message) {
		super(message);
	}

	public BankManagementException(Throwable cause) {
		super(cause);
	}

}
