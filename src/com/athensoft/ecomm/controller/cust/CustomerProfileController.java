package com.athensoft.ecomm.controller.cust;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.entity.cust.CustomerProfile;
import com.athensoft.ecomm.entity.cust.ShipAddress;
import com.athensoft.ecomm.service.cust.CustomerProfileService;
import com.athensoft.ecomm.service.cust.ShipAddressService;

@Controller
public class CustomerProfileController {
	
	private CustomerProfileService customerProfileService;
	
	@Autowired
	public void setCustomerProfileService(
			CustomerProfileService customerProfileService) {
		this.customerProfileService = customerProfileService;
	}
	@RequestMapping("/view_customerprofile.do")
	public ModelAndView viewCustomerProfile(){
		System.out.println("entering view_customerprofile.do");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user_customerprofile");
		
		Map<String, Object> model = mav.getModel();
		int customerId = 1; //test
		CustomerProfile customerProfile = customerProfileService.getCustomerProfile(customerId);

		model.put("customerProfile",customerProfile);
		return mav;
	}
}
