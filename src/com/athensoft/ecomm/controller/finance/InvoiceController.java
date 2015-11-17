package com.athensoft.ecomm.controller.finance;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.entity.finance.Invoice;
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

			List<Invoice> invoiceList = invoiceService.getInvoiceAll();
			Map<String, Object> model = mav.getModel();
			model.put("invoiceList", invoiceList);
			
			return mav; 
		}

}
