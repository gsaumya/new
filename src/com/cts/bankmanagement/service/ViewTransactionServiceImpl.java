package com.cts.bankmanagement.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.bankmanagement.dao.ViewTransactionDao;
import com.cts.bankmanagement.vo.TransactionVo;

@Service("viewService")
public class ViewTransactionServiceImpl implements ViewTransactionService {

	@Autowired
	private ViewTransactionDao viewDao;

	@Transactional
	@Override
	public List<TransactionVo> retreiveTransactionService(Long accountNumber, Long transactionId) {

		if (accountNumber != null && transactionId != null) {
			return viewDao.getTransactionDetails(accountNumber,transactionId);
		} else if (accountNumber != null && transactionId==null) {
			System.out.println("in srvice "+transactionId);
			System.out.println("in srvice "+viewDao.getTransactionDetails(accountNumber));
			return (viewDao.getTransactionDetails(accountNumber));
		} else if (transactionId != null) {
			return Arrays.asList((viewDao.retreiveTransactionDao(transactionId)));
		} else {
			return null;
		}

	}


}
