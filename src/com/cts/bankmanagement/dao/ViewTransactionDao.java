package com.cts.bankmanagement.dao;

import java.util.List;

import com.cts.bankmanagement.vo.TransactionVo;

public interface ViewTransactionDao {

	TransactionVo retreiveTransactionDao(Long transactionId);

	List<TransactionVo> getTransactionDetails(Long accountNumber, Long transactionId);

	List<TransactionVo> retreiveTransactionDao(Long accountNumber, Long transactionId);

	List<TransactionVo> getTransactionDetails(Long accountNumber);

	//List<TransactionVo> getTransactionDetails1(Long accountNumber);
}
