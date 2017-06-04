package com.cts.bankmanagement.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.bankmanagement.entity.TransactionDetail;
import com.cts.bankmanagement.vo.TransactionVo;

@Repository("transactionDao")
public class PerformTransactionDaoImpl implements PerformTransactionDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Double updateTransactionDetail(TransactionVo transactionVo) {

		TransactionDetail ud = prepareUser(transactionVo);
		Long transactionId = (Long) sessionFactory.getCurrentSession().save(ud);
		Double d = transactionId.doubleValue();
		return d;
	}

	private TransactionDetail prepareUser(TransactionVo transactionvo) {
		return new TransactionDetail(transactionvo.getAccountNumber(), transactionvo.getTransactionId(),
				transactionvo.getCustomerName(), transactionvo.getTransactionType(),
				transactionvo.getTransactionAmount(), transactionvo.getDescription());
	}

}
