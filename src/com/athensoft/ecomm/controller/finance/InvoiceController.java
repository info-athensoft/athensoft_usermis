package com.athensoft.ecomm.controller.finance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.entity.finance.Invoice;
import com.athensoft.ecomm.entity.finance.InvoiceStatus;
import com.athensoft.ecomm.service.finance.InvoiceService;

@Controller
public class InvoiceController {

		private InvoiceService invoiceService;
		
		@Autowired
		public void setInvoiceService(InvoiceService invoiceService) {
			this.invoiceService = invoiceService;
		}

		@RequestMapping("/view_invoice.do")
		public ModelAndView viewInvoice(){
			System.out.println("entering view_invoice.do");
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("user_invoice");
			
			//set query conditions
			Invoice qryObject = new Invoice();
			qryObject.setCustId(1);
			SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			String strDate = "2015-07-01";
			Date outstandingDate = null;
			try {
				outstandingDate = ft.parse(strDate);
				qryObject.setIssuedDate(outstandingDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}			
			
			//outstanding invoices
			List<Invoice> invoiceList = invoiceService.getOutStandingInvoiceByCustId(qryObject);
			Map<String, Object> model = mav.getModel();
			model.put("invoiceList", invoiceList);
			
			
			//get summary info
			//total grand amount of outstanding invoices
			model.put("grandTotalAmount", getGrandTotalAmount(invoiceList));
			model.put("paidTotalAmount", getPaidTotalAmount(invoiceList));
			model.put("balanceDueAmount", getBalanceDueAmount(invoiceList));
			
			
			//history invoices
			List<Invoice> invoiceHistoryList = invoiceService.getHistoryInvoiceByCustId(qryObject);
			model.put("invoiceHistoryList", invoiceHistoryList);
			
			//			
			return mav; 
		}
		
		/* private utilities */
		/**
		 * calculate grand total from all outstanding invoices
		 * @param invoiceList
		 * @return
		 */
		private double getGrandTotalAmount(List<Invoice> invoiceList){
			double amt = 0.0;
			if(invoiceList==null || invoiceList.size()==0){				
			}else{
				for(Invoice inv : invoiceList){
					amt += inv.getInvoiceGrandTotal();
				}
			}
			return amt;
		}
		
		private double getPaidTotalAmount(List<Invoice> invoiceList){
			double amt = 0.0;
			if(invoiceList==null || invoiceList.size()==0){				
			}else{
				for(Invoice inv : invoiceList){
					if(inv.getInvoiceStatus()==InvoiceStatus.PAID){
						amt += inv.getInvoiceGrandTotal();
					}
				}
			}
			return amt;
		}
		
		private double getBalanceDueAmount(List<Invoice> invoiceList){
			double amt = 0.0;
			if(invoiceList==null || invoiceList.size()==0){				
			}else{
				for(Invoice inv : invoiceList){
					if(inv.getInvoiceStatus()==InvoiceStatus.UNPAID){
						amt += inv.getInvoiceGrandTotal();
					}
				}
			}
			return amt; 
		}
		
		

}
