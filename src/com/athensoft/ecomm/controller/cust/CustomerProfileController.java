package com.athensoft.ecomm.controller.cust;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.athensoft.ecomm.service.cust.CustomerProfileService;

@Controller
public class CustomerProfileController {
	
	private CustomerProfileService customerProfileService;
	
	@Autowired
	public void setCustomerProfileService(
			CustomerProfileService customerProfileService) {
		this.customerProfileService = customerProfileService;
	}
	
}
