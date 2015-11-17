package com.athensoft.ecomm.service.finance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.athensoft.ecomm.dao.finance.InvoiceDao;
import com.athensoft.ecomm.entity.finance.Invoice;

@Service
public class InvoiceService {
	
	private InvoiceDao invoiceDao;
	
	@Autowired
	public void setInvoiceDao(InvoiceDao invoiceDao) {
		this.invoiceDao = invoiceDao;
	}
	
	public List<Invoice> getInvoiceAll(){
		List<Invoice> invoiceList = invoiceDao.findAll();
		return invoiceList;
	}
	
	public List<Invoice> getInvoiceAllByCustId(int custId){
		List<Invoice> invoiceList = invoiceDao.findAllByCustId(custId);
		return invoiceList;
	}



	
}
