package com.athensoft.ecomm.service.finance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.ecomm.dao.finance.InvoiceDao;
import com.athensoft.ecomm.entity.finance.Invoice;

@Service
public class InvoiceService {
	
	private InvoiceDao invoiceDao;
	
	@Autowired
	@Qualifier("invoiceDaoParam")
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
	
	public List<Invoice> getOutStandingInvoiceByCustId(Invoice qryInvoiceObj){
		List<Invoice> invoiceList = invoiceDao.findByCustIdAfterIssuedDate(qryInvoiceObj);
		return invoiceList;
	}
	
	public List<Invoice> getHistoryInvoiceByCustId(Invoice qryInvoiceObj){
		List<Invoice> invoiceList = invoiceDao.findByCustIdBeforeIssuedDate(qryInvoiceObj);
		return invoiceList;
	}



	
}
