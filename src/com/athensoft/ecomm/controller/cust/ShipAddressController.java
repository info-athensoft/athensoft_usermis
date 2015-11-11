package com.athensoft.ecomm.controller.cust;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.entity.cust.ShipAddress;
import com.athensoft.ecomm.service.cust.ShipAddressService;

@Controller
public class ShipAddressController {
	ShipAddressService shipAddressService;
	
	@Autowired
	public void setShipAddressService(ShipAddressService shipAddressService) {
		this.shipAddressService = shipAddressService;
	}

	@RequestMapping("/view_shipaddress.do")
	public ModelAndView viewShipAddress(){
		System.out.println("entering view_shipaddress.do");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user_shipaddress");
		
		Map<String, Object> model = mav.getModel();
		List<ShipAddress> shipAddressList = shipAddressService.getShipAddressList();
		
		//test
		System.out.println("shipAddressList="+shipAddressList.size());
		
		model.put("shipAddressList",shipAddressList);
		return mav;
	}
}