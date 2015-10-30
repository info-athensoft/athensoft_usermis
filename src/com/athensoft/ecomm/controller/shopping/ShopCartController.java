package com.athensoft.ecomm.controller.shopping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopCartController {
	
	@RequestMapping("/view_cart.do")
	public String viewCart(){
		return "shop_cart";
	}
	
	@RequestMapping("/shop_checkout.do")
	public String gotoCheckout(){
		return "shop_checkout";
	}
}
