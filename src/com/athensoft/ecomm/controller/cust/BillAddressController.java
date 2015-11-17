package com.athensoft.ecomm.controller.cust;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.entity.cust.BillAddress;
import com.athensoft.ecomm.service.cust.BillAddressService;

@Controller
public class BillAddressController {
	BillAddressService billAddressService;
	
	@Autowired
	public void setBillAddressService(BillAddressService billAddressService) {
		this.billAddressService = billAddressService;
	}

	@RequestMapping("/view_billaddress.do")
	public ModelAndView viewBillAddress(){
		System.out.println("entering view_billaddress.do");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user_billaddress");
		
		Map<String, Object> model = mav.getModel();
		List<BillAddress> billAddressList = billAddressService.getBillAddressList();
		
		//test
		System.out.println("billAddressList="+billAddressList.size());
		
		model.put("billAddressList",billAddressList);
		return mav;
	}
	
	
	@RequestMapping(value="/view_billaddress_json.do",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> viewBillAddressJson(){
		System.out.println("entering view_billaddress_json.do");
		
		ModelAndView mav = new ModelAndView();
		
		Map<String, Object> model = mav.getModel();
		List<BillAddress> billAddressList = billAddressService.getBillAddressList();
		
		//test
		System.out.println("billAddressList="+billAddressList.size());
		
		model.put("billAddressList",billAddressList);
		return model;
	}
}
