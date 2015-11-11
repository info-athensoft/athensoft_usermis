package com.athensoft.ecomm.service.cust;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.ecomm.dao.cust.ShipAddressDao;
import com.athensoft.ecomm.entity.cust.ShipAddress;

@Service
public class ShipAddressService {
	private ShipAddressDao shipAddressDao;
		
		@Autowired
		@Qualifier("shipAddressDaoParam")
		public void setShipAddressDao(ShipAddressDao shipAddressDao) {
			this.shipAddressDao = shipAddressDao;
		}
		
		public List<ShipAddress> getShipAddressList(){
			List<ShipAddress> shipAddressList = shipAddressDao.findAll();
			return shipAddressList;
		}
		
}