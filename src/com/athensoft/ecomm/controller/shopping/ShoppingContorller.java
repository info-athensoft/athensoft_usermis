package com.athensoft.ecomm.controller.shopping;



import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.entity.shopping.ItemCart;
import com.athensoft.ecomm.service.shopping.ItemCartService;
import com.sun.org.glassfish.gmbal.ParameterNames;


@Controller
@SessionAttributes(value={"itemProdList"})
public class ShoppingContorller {
	
	//cart subtotal
	double doubleCartSubTotal = 0;
	
	//freight,shipping
	double freight = 0;
	
	//handling fee
	double handlingfee = 0;
	
	//discount amout of order
	double doubleDiscount = 0;
	String couponType = "";     //percentage, amount
	double couponValue = 0;
	
	//order total
	double doubleOrderTotal = 0;
	
	//shopping cart
	private Map<String,ItemCart> mapProdInCart = new HashMap<String,ItemCart>();
	private Map<String,Boolean> mapProdInCartStat = new HashMap<String,Boolean>();
	
	//
	private ItemCartService itemCartService;
	
	@Autowired
	public void setItemCartService(ItemCartService itemCartService) {
		this.itemCartService = itemCartService;
	}
	
	//
	@RequestMapping("/shopping_products.do")	
	public ModelAndView viewProd(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shopping_products");
		
		List<ItemCart> itemProdList = itemCartService.getItemCartList();
		Map<String, Object> data = mav.getModel();
		data.put("itemProdList", itemProdList);
		//test by Athens 2015-0506-1130
		//session.setAttribute("itemProdList", itemProdList);
		//instead, using @SessionAttributes(value={"itemProdList"}) to put model data into session scope
		return mav;
	}
	
		
	@RequestMapping("/shopping_viewcart.do")	
	public ModelAndView viewCart(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shop_cart");	
		
		return mav;
	}
	
	
	
	@RequestMapping("/addtocart.do")	
	public ModelAndView addToCart(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/view_cart.do");	
		
		//
		System.out.println("entering AddToCartServlet ...");
		String strItemId = (String)request.getParameter("itemId");
		System.out.println("prodId = "+strItemId);
		HttpSession session = request.getSession(true);
		
		boolean isProdInCart = mapProdInCart.containsKey(strItemId);
		if(isProdInCart){
			mapProdInCartStat.put(strItemId, true);
		}else{
			int itemId = Integer.parseInt(strItemId);

			//from database
			ItemCart prodObj = itemCartService.getItemCartEntry(itemId);
			
			mapProdInCart.put(strItemId, prodObj);
			mapProdInCartStat.put(strItemId, true);
			session.setAttribute("mapProdInCart", mapProdInCart);
			//request.setAttribute("isProdInCart", true);
			session.setAttribute("mapProdInCartStat", mapProdInCartStat);
			System.out.println(mapProdInCart.toString());
		}		
		
		
		//calculate cart subtotal
		doubleCartSubTotal = 0;		
		Iterator<Map.Entry<String, ItemCart>> entries = mapProdInCart.entrySet().iterator();
		while(entries.hasNext()){
			Entry<String, ItemCart> thisEntry = (Entry<String, ItemCart>)entries.next();
			ItemCart itemCartObj = thisEntry.getValue();
			doubleCartSubTotal += itemCartObj.getPrice() * itemCartObj.getQty();
		}
		session.setAttribute("cartSubTotal", doubleCartSubTotal);
		
		//order total
		session.setAttribute("orderTotal", this.doubleOrderTotal);
		
			
		//request.getRequestDispatcher("products.jsp").forward(request, response);
		System.out.println("exiting AddToCartServlet ...");		
		
		return mav;
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/clear_cart.do")	
	public ModelAndView clearCart(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:view_cart.do");	
		
		System.out.println("entering ClearCartServlet ...");
		HttpSession session = request.getSession();
		Map<String,ItemCart> mapProdInCart = (HashMap<String,ItemCart>)(session.getAttribute("mapProdInCart"));
		Map<String,Boolean> mapProdInCartStat = (HashMap<String,Boolean>)(session.getAttribute("mapProdInCartStat"));
		if(mapProdInCart!=null){
			mapProdInCart.clear();
			mapProdInCartStat.clear();
			session.setAttribute("mapProdInCart", mapProdInCart);
			session.setAttribute("mapProdInCartStat", mapProdInCartStat);
		}
			
		
//		request.getRequestDispatcher("viewCart.jsp").forward(request, response);
		
		//calculate cart subtotal
		this.doubleCartSubTotal = 0;		
		session.setAttribute("cartSubTotal", this.doubleCartSubTotal);
		
		//order total
		this.doubleOrderTotal = 0;
		session.setAttribute("orderTotal", this.doubleOrderTotal);
		
		//discount
		this.doubleDiscount = 0;
		session.setAttribute("discountAmt", this.doubleDiscount);
		
		//test
		System.out.println("exiting ClearCartServlet ...");	
		
		return mav;
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/remove_product.do")
	public ModelAndView removeProduct(HttpServletRequest request, HttpServletResponse response){
		System.out.println("entering RemoveProductServlet ...");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shop_cart");	
		
		HttpSession session = request.getSession();
		Map<String,ItemCart> mapProdInCart = (HashMap<String,ItemCart>)(session.getAttribute("mapProdInCart"));
		Map<String,ItemCart> mapProdInCartStat = (HashMap<String,ItemCart>)(session.getAttribute("mapProdInCartStat"));
		//mapProdInCart.clear();
		String strItemId = (String)request.getParameter("itemId");
		System.out.println("prodId = "+strItemId);
		mapProdInCart.remove(strItemId);
		mapProdInCartStat.remove(strItemId);
		session.setAttribute("mapProdInCart", mapProdInCart);
		session.setAttribute("mapProdInCartStat", mapProdInCartStat);
		
//		request.getRequestDispatcher("viewCart.jsp").forward(request, response);
		
		//calculate cart subtotal
		doubleCartSubTotal = 0;		
		Iterator<Map.Entry<String, ItemCart>> entries = mapProdInCart.entrySet().iterator();
		while(entries.hasNext()){
			Entry<String, ItemCart> thisEntry = (Entry<String, ItemCart>)entries.next();
			ItemCart itemCartObj = thisEntry.getValue();
			doubleCartSubTotal += itemCartObj.getPrice() * itemCartObj.getQty();
		}
		session.setAttribute("cartSubTotal", doubleCartSubTotal);
		
		//re-calculate discount
		if(couponType.equalsIgnoreCase("percentage")){
			this.doubleDiscount = this.doubleCartSubTotal * couponValue /100.0;
		}
		if(couponType.equalsIgnoreCase("amount")){
			this.doubleDiscount = couponValue;
		}		
		session.setAttribute("discountAmt", doubleDiscount);
		
		//order total
		this.doubleOrderTotal = getOrderTotal();
		session.setAttribute("orderTotal", this.doubleOrderTotal);
		
		System.out.println("exiting RemoveProductServlet ...");
		
		return mav;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/update_cart.do")
	public ModelAndView updateCart(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shop_cart");	
		
		System.out.println("entering UpdateCartServlet ...");
		
		String strItemId = (String)request.getParameter("itemId");
		System.out.println("prodId = "+strItemId);
		
		String qty = (String)request.getParameter("qty");
		System.out.println("qty = "+qty);
		
		HttpSession session = request.getSession(true);
		int itemId = Integer.parseInt(strItemId);
		ItemCart prodObj = itemCartService.getItemCartEntry(itemId);
		prodObj.setQty(Integer.parseInt(qty));
		
		Map<String,ItemCart> mapProdInCart = (HashMap<String,ItemCart>)(session.getAttribute("mapProdInCart"));
		
		mapProdInCart.put(strItemId, prodObj);
		session.setAttribute("mapProdInCart", mapProdInCart);
		
		System.out.println(mapProdInCart.toString());

		//calculate cart subtotal
		doubleCartSubTotal = 0;		
		Iterator<Map.Entry<String, ItemCart>> entries = mapProdInCart.entrySet().iterator();
		while(entries.hasNext()){
			Entry<String, ItemCart> thisEntry = (Entry<String, ItemCart>)entries.next();
			ItemCart itemCartObj = thisEntry.getValue();
			doubleCartSubTotal += itemCartObj.getPrice() * itemCartObj.getQty();
		}
		session.setAttribute("cartSubTotal", doubleCartSubTotal);
		
		//re-calculate discount
		if(couponType.equalsIgnoreCase("percentage")){
			this.doubleDiscount = this.doubleCartSubTotal * couponValue /100.0;
		}
		if(couponType.equalsIgnoreCase("amount")){
			this.doubleDiscount = couponValue;
		}		
		session.setAttribute("discountAmt", doubleDiscount);
		
		//order total
		this.doubleOrderTotal = getOrderTotal();
		session.setAttribute("orderTotal", this.doubleOrderTotal);
		
		System.out.println("exiting AddToCartServlet ...");
		return mav;
	}
	
	//
	@RequestMapping("/apply_discount.do")	
	public ModelAndView applyDiscount(
							@RequestParam double couponValue,
							@RequestParam String couponType,
							HttpSession session){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shop_cart");
		
		this.couponType = couponType;
		this.couponValue = couponValue;
		
		
		if(couponType.equalsIgnoreCase("percentage")){
			this.doubleDiscount = this.doubleCartSubTotal * couponValue /100.0;
		}
		if(couponType.equalsIgnoreCase("amount")){
			this.doubleDiscount = couponValue;
		}
		
		session.setAttribute("discountAmt", doubleDiscount);
		
		//order total
		this.doubleOrderTotal = this.getOrderTotal();
		session.setAttribute("orderTotal", this.doubleOrderTotal);
				
		return mav;
	}
	
	
	//
	@RequestMapping("/goto_checkout.do")	
	public ModelAndView checkout(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("pay_checkout");
		
		return mav;
	}
	
	
	//calculate order total
	private double getOrderTotal(){
		double orderTotal = this.doubleCartSubTotal
				          + this.freight
				          + this.handlingfee
				          - this.doubleDiscount;
		return orderTotal;
	}
	
}
