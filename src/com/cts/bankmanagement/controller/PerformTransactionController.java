package com.cts.bankmanagement.controller;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cts.bankmanagement.service.PerformTransactionService;
import com.cts.bankmanagement.vo.TransactionVo;

@Controller
public class PerformTransactionController {

	@Autowired
	PerformTransactionService transactionService;

	@ResponseBody
	@RequestMapping(value = "/static/html/Transaction/performtransaction", method = RequestMethod.POST)
	ModelAndView initiateTransaction(@RequestParam(value = "accountNumber") Long accountNumber,
			@RequestParam(value = "transactionId") Long transactionId,
			@RequestParam(value = "customerName") String customerName,
			@RequestParam(value = "transactionType") String transactionType,
			@RequestParam(value = "transactionAmount") Double transactionAmount,
			@RequestParam(value = "description") String description) {

		System.out.println("Hello");
		TransactionVo transactionvo = new TransactionVo(accountNumber, transactionId, customerName, transactionType, transactionAmount, description);
		System.out.println("In controller");

		Double tid = transactionService.updateTransactionDetail(transactionvo);
		transactionvo.setTransactionAmount(tid);

		System.out.println("performTransaction");
		return new ModelAndView("transaction", "user", transactionId);

	}
}
