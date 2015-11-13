package com.athensoft.ecomm.controller.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.service.item.ItemService;

@Controller
public class ItemController {
	
	private ItemService itemService;
	
	@Autowired
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	@RequestMapping("/view_item.do")
	public ModelAndView viewProduct(){
		System.out.println("entering view_item.do");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user_item");
		
		return mav; 
	}
}
