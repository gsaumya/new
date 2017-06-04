package com.cts.bankmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.bankmanagement.dao.PerformTransactionDao;
import com.cts.bankmanagement.vo.TransactionVo;

@Service("transactionService")
public class PerformTransactionServiceImpl implements PerformTransactionService {

	@Autowired
	PerformTransactionDao transactionDao;

	@Transactional
	@Override
	public Double updateTransactionDetail(TransactionVo transactionVo) {
		return transactionDao.updateTransactionDetail(transactionVo);
	}

}
