package com.cts.bankmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {

	// Add appropriate annotations and code wherever required
	@ResponseBody
	@RequestMapping(value = "/hellospring", method = RequestMethod.GET)
	public String hello() {
		return "hello from spring 212";
	}

}
