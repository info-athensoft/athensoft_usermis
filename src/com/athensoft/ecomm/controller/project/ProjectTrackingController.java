package com.athensoft.ecomm.controller.project;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ProjectTrackingController {
	@RequestMapping("/track_project.do")
	public ModelAndView viewProjectHistorcial(){
		System.out.println("entering track_project.do");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user_track_project");
		
		Map<String, Object> model = mav.getModel();
		
		
		
		return mav;
	}
}
