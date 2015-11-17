package com.athensoft.ecomm.dao.cust;

import com.athensoft.ecomm.entity.cust.CustomerProfile;

public interface CustomerProfileDao {
	public CustomerProfile findByCustId(int custId);
}
	