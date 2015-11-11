package com.athensoft.ecomm.dao.cust;

import java.util.List;

import com.athensoft.ecomm.entity.cust.ShipAddress;

public interface ShipAddressDao {
	
	/** 
	 * find All Shipping Address 
	 */
	public List<ShipAddress> findAll();
}

