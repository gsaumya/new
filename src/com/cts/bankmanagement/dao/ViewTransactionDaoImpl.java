package com.cts.bankmanagement.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.cts.bankmanagement.entity.TransactionDetail;
import com.cts.bankmanagement.vo.TransactionVo;

@Repository("viewDao")
public class ViewTransactionDaoImpl implements ViewTransactionDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<TransactionVo> retreiveTransactionDao(Long accountNumber, Long transactionId) {
		/*Query query = sessionFactory.getCurrentSession().createQuery(
				"from TransactionDetail where accountNumber " + "= :acNo and transactionId = :transactionId");
		query.setParameter("acNo", accountNumber);
		query.setParameter("transactionId", transactionId);
		return getTransactionsVo((List<TransactionDetail>) query.list());*/
		return null;
	}

	private List<TransactionVo> getTransactionsVo(List<TransactionDetail> transactions) {
		if (CollectionUtils.isEmpty(transactions)) {
			return Collections.emptyList();
		}

		List<TransactionVo> usersVO = new ArrayList<TransactionVo>(transactions.size());
		for (TransactionDetail user : transactions) {
			usersVO.add(getTransactionVo(user));
		}
		return usersVO;
	}

	private TransactionVo getTransactionVo(TransactionDetail transactionDetails) {
		return new TransactionVo(transactionDetails.getAccountNumber(), transactionDetails.getTransactionId(),
				transactionDetails.getCustomerName(), transactionDetails.getTransactionType(),
				transactionDetails.getTransactionAmount(), transactionDetails.getDescription());

	}

	@Override
	public TransactionVo retreiveTransactionDao(Long transactionId) {
		return getTransactionVo(
				(TransactionDetail) sessionFactory.getCurrentSession().get(TransactionDetail.class, transactionId));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TransactionVo> getTransactionDetails(Long accountNumber) {
		System.out.println("1111");
		System.out.println(accountNumber);
		Query query = sessionFactory.getCurrentSession().createQuery("from TransactionDetail where  " + " accountNumber= :acNo ");
		System.out.println("in dao0"+query.list());
		System.out.println("in daoq"+query);
		query.setParameter("acNo", accountNumber);
		
		//query.setParameter(1, "accountNumber");
		System.out.println("in dao1"+query.list());
		return query.list();
	} 
	@SuppressWarnings("unchecked")
	@Override
	public List<TransactionVo> getTransactionDetails(Long accountNumber, Long transactionId) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from TransactionDetail where  " + " accountNumber= :acNo and transactionId = :transactionId");
		System.out.println("in dao02"+query);
		query.setParameter("acNo", accountNumber);
		query.setParameter("transactionId", transactionId);
		List<TransactionVo> ls=query.list();
		System.out.println("in dao2"+ls);
//		return getTransactionsVo((List<TransactionDetail>) query.list());
		return ls;
	  
	}

	
}
