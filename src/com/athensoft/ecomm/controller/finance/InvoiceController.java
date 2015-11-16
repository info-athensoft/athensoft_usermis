package com.athensoft.ecomm.controller.finance;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.entity.item.Item;
import com.athensoft.ecomm.service.item.ItemService;

@Controller
public class InvoiceController {

//		private ItemService itemService;
//		
//		@Autowired
//		public void setItemService(ItemService itemService) {
//			this.itemService = itemService;
//		}

		@RequestMapping("/view_invoice.do")
		public ModelAndView viewInvoice(){
			System.out.println("entering view_invoice.do");
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("user_invoice");

//			List<Item> itemList = invoiceService.getItemAll();
//			Map<String, Object> model = mav.getModel();
//			model.put("invoiceList", invoiceList);
			
			return mav; 
		}

}
