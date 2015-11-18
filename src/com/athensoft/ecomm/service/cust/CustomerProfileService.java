package com.athensoft.ecomm.service.cust;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.ecomm.dao.cust.CustomerProfileDao;
import com.athensoft.ecomm.entity.cust.CustomerProfile;

@Service
public class CustomerProfileService {
	private CustomerProfileDao customerProfileDao;
	
	@Autowired
	@Qualifier("customerProfileDaoParam")
	public void setCustomerProfileDao(CustomerProfileDao customerProfileDao) {
		this.customerProfileDao = customerProfileDao;
	}
	
	public CustomerProfile getCustomerProfile(int custId){
		return customerProfileDao.findByCustId(custId);
	}
	
}
