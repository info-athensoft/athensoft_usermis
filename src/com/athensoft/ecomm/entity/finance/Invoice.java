package com.athensoft.ecomm.entity.finance;

import java.util.Date;

public class Invoice {
	private long invoiceId;
	private String invoiceNum;
	private String invoiceDesc;
	private Date issuedDate;
	private Date dueDate;
	private String invoiceTerms;
	private int invoiceStatus;
	private int custId;
	
	private int billAddrId;
	private int shipAddrId;
	private double invoiceSubTotal;
	private double invoiceDiscount;
	private double totalBeforeTax;
	private double GST_HSTAmount;
	private double QST_PSTAmount;
	private double invoiceGrandTotal;
	
	
	public long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getInvoiceNum() {
		return invoiceNum;
	}
	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	public String getInvoiceDesc() {
		return invoiceDesc;
	}
	public void setInvoiceDesc(String invoiceDesc) {
		this.invoiceDesc = invoiceDesc;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getInvoiceTerms() {
		return invoiceTerms;
	}
	public void setInvoiceTerms(String invoiceTerms) {
		this.invoiceTerms = invoiceTerms;
	}
	public int getInvoiceStatus() {
		return invoiceStatus;
	}
	public void setInvoiceStatus(int invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getBillAddrId() {
		return billAddrId;
	}
	public void setBillAddrId(int billAddrId) {
		this.billAddrId = billAddrId;
	}
	public int getShipAddrId() {
		return shipAddrId;
	}
	public void setShipAddrId(int shipAddrId) {
		this.shipAddrId = shipAddrId;
	}
	public double getInvoiceSubTotal() {
		return invoiceSubTotal;
	}
	public void setInvoiceSubTotal(double invoiceSubTotal) {
		this.invoiceSubTotal = invoiceSubTotal;
	}
	public double getInvoiceDiscount() {
		return invoiceDiscount;
	}
	public void setInvoiceDiscount(double invoiceDiscount) {
		this.invoiceDiscount = invoiceDiscount;
	}
	public double getTotalBeforeTax() {
		return totalBeforeTax;
	}
	public void setTotalBeforeTax(double totalBeforeTax) {
		this.totalBeforeTax = totalBeforeTax;
	}
	public double getGST_HSTAmount() {
		return GST_HSTAmount;
	}
	public void setGST_HSTAmount(double gST_HSTAmount) {
		GST_HSTAmount = gST_HSTAmount;
	}
	public double getQST_PSTAmount() {
		return QST_PSTAmount;
	}
	public void setQST_PSTAmount(double qST_PSTAmount) {
		QST_PSTAmount = qST_PSTAmount;
	}
	public double getInvoiceGrandTotal() {
		return invoiceGrandTotal;
	}
	public void setInvoiceGrandTotal(double invoiceGrandTotal) {
		this.invoiceGrandTotal = invoiceGrandTotal;
	}
	
	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", invoiceNum=" + invoiceNum + ", invoiceDesc=" + invoiceDesc
				+ ", issuedDate=" + issuedDate + ", dueDate=" + dueDate + ", invoiceTerms=" + invoiceTerms
				+ ", invoiceStatus=" + invoiceStatus + ", custId=" + custId + ", billAddrId=" + billAddrId
				+ ", shipAddrId=" + shipAddrId + ", invoiceSubTotal=" + invoiceSubTotal + ", invoiceDiscount="
				+ invoiceDiscount + ", totalBeforeTax=" + totalBeforeTax + ", GST_HSTAmount=" + GST_HSTAmount
				+ ", QST_PSTAmount=" + QST_PSTAmount + ", invoiceGrandTotal=" + invoiceGrandTotal + "]";
	}
	
	
	
}
