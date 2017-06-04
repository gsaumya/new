package com.cts.bankmanagement.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.bankmanagement.entity.UserDetails;
import com.cts.bankmanagement.vo.UserVO;

@Repository("userDao")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Long addUserDetails(UserVO userVO) {
		UserDetails user = prepareUser(userVO);
		Long accountNumber = (Long) sessionFactory.getCurrentSession().save(user);
		return accountNumber;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserVO> getUsersDetails() {
		List<UserDetails> users = sessionFactory.getCurrentSession().createCriteria(UserDetails.class).list();
		List<UserVO> usersVO = new ArrayList<UserVO>(users.size());
		for (UserDetails user : users) {
			usersVO.add(prepareUserVO(user));
		}
		return usersVO;
	}

	@Override
	public UserVO getUserDetails(Long accountNumber) {
		return prepareUserVO((UserDetails) sessionFactory.getCurrentSession().get(UserDetails.class, accountNumber));
	}

	private UserDetails prepareUser(UserVO userVO) {
		return new UserDetails(userVO.getAccountNumber(), userVO.getAccountType(), userVO.getAccountHolderName(),
				userVO.getAccountBalance());
	}

	private UserVO prepareUserVO(UserDetails user) {
		return new UserVO(user.getAccountNumber(), user.getAccountType(), user.getAccountHolderName(),
				user.getAccountBalance());
	}

}