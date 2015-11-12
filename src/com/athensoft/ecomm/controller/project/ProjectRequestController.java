package com.athensoft.ecomm.controller.project;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectRequestController {
	@RequestMapping("/request_project.do")
	public ModelAndView requestProject(){
		System.out.println("entering request_project.do");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user_project_request");
		
		Map<String, Object> model = mav.getModel();
		return mav;
	}
}
