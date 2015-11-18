package com.athensoft.ecomm.dao.cust;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.entity.cust.CustomerProfile;
import com.athensoft.ecomm.entity.cust.ShipAddress;
import com.athensoft.ecomm.service.cust.ShipAddressService;

public interface CustomerProfileDao {
	public CustomerProfile findByCustId(int custId);
	
	

}
	