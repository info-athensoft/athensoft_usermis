package com.athensoft.ecomm.controller.project;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectRequirementController {
	@RequestMapping("/post_projectreq.do")
	public ModelAndView postProjectReq(){
		System.out.println("entering post_projectreq.do");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user_project_postreq");
		
		Map<String, Object> model = mav.getModel();
		return mav;
	}
}
