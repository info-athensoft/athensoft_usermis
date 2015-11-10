package com.athensoft.ecomm.service.cust;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.ecomm.dao.cust.BillAddressDao;
import com.athensoft.ecomm.entity.cust.BillAddress;

@Service
public class BillAddressService {
	private BillAddressDao billAddressDao;
		
		@Autowired
		@Qualifier("billAddressDaoParam")
		public void setBillAddressDao(BillAddressDao billAddressDao) {
			this.billAddressDao = billAddressDao;
		}
		
		public List<BillAddress> getBillAddressList(){
			List<BillAddress> billAddressList = billAddressDao.findAll();
			return billAddressList;
		}
		
}

