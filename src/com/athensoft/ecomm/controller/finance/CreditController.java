package com.athensoft.ecomm.controller.finance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CreditController {

//		private ItemService itemService;
//		
//		@Autowired
//		public void setItemService(ItemService itemService) {
//			this.itemService = itemService;
//		}

		@RequestMapping("/view_credit.do")
		public ModelAndView viewInvoice(){
			System.out.println("entering view_credit.do");
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("user_credit");

//			List<Item> itemList = invoiceService.getItemAll();
//			Map<String, Object> model = mav.getModel();
//			model.put("invoiceList", invoiceList);
			
			return mav; 
		}

}
