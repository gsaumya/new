package com.cts.bankmanagement.controller;

import java.text.MessageFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cts.bankmanagement.service.ViewTransactionService;
import com.cts.bankmanagement.vo.TransactionVo;

@Controller
public class ViewTransactionController {
	@Autowired
	private ViewTransactionService viewService;

	@ResponseBody
	@RequestMapping(value = "/static/html/Transaction/viewtransactionrest", method = RequestMethod.POST)
	public List<TransactionVo> searchTransactionDetail(Long accountNumber, Long transactionId) {
		viewService.retreiveTransactionService(accountNumber, transactionId);
		return null;
		
	}
	@RequestMapping(value = "/static/html/Transaction/viewtransaction", method = RequestMethod.POST)
	ModelAndView retreiveTransactionService(@RequestParam(value = "accountNumber") Long accountNumber,
			@RequestParam(value = "transactionId") Long transactionId) {
			System.out.println("cont"+transactionId+accountNumber);
			
			List<TransactionVo> List =viewService.retreiveTransactionService(accountNumber, transactionId);
			System.out.println("in controller"+List);
			return new ModelAndView("view", "users", List);
		
		
			
		}
		
		
		
	

		
	
		
	}

