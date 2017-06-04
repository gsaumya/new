package com.cts.bankmanagement.service;

import java.util.List;

import com.cts.bankmanagement.vo.TransactionVo;

public interface ViewTransactionService {

	List<TransactionVo> retreiveTransactionService(Long accountNumber, Long transactionId);

	//java.util.List<TransactionVo> retreiveTransactionService1(Long accountNumber);

	//List<TransactionVo> getTransactionsVo(Long accountNumber, Long transactionId);

	
}
