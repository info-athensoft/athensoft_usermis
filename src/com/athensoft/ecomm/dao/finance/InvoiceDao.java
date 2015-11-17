package com.athensoft.ecomm.dao.finance;

import java.util.List;

import com.athensoft.ecomm.entity.finance.Invoice;

public interface InvoiceDao {
	public List<Invoice> findAll();
	public List<Invoice> findAllByCustId(int custId);
	
	public List<Invoice> findByCustIdAfterIssuedDate(Invoice qryInvoiceObj);
	public List<Invoice> findByCustIdBeforeIssuedDate(Invoice qryInvoiceObj);
}
