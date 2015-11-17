package com.athensoft.ecomm.entity.cust;

import java.util.List;

public class CustomerProfile {
	private CustBasicInfo custBasicInfo;
	private CustContactInfo custContactInfo;
	
	private List<BillAddress> billAddressList;
	private List<ShipAddress> shipAddressList;
	
	
	public CustBasicInfo getCustBasicInfo() {
		return custBasicInfo;
	}
	public void setCustBasicInfo(CustBasicInfo custBasicInfo) {
		this.custBasicInfo = custBasicInfo;
	}
	public CustContactInfo getCustContactInfo() {
		return custContactInfo;
	}
	public void setCustContactInfo(CustContactInfo custContactInfo) {
		this.custContactInfo = custContactInfo;
	}
	public List<BillAddress> getBillAddressList() {
		return billAddressList;
	}
	public void setBillAddressList(List<BillAddress> billAddressList) {
		this.billAddressList = billAddressList;
	}
	public List<ShipAddress> getShipAddressList() {
		return shipAddressList;
	}
	public void setShipAddressList(List<ShipAddress> shipAddressList) {
		this.shipAddressList = shipAddressList;
	}
	
	
	
}
