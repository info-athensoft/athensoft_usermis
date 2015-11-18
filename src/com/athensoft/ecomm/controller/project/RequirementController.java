package com.athensoft.ecomm.controller.project;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.service.project.RequirementService;

@Controller
public class RequirementController {
	private RequirementService requirementService;
	
	@Autowired
	public void setRequirementService(RequirementService requirementService) {
		this.requirementService = requirementService;
	}
	
	@RequestMapping("/goto_projectreq.do")
	public ModelAndView gotoRequirement(){
		System.out.println("entering goto_projectreq.do");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user_project_postreq");
		
		Map<String, Object> model = mav.getModel();
		return mav;
	}
	
	@RequestMapping("/goto_requirement_form.do")
	public ModelAndView gotoRequirementFrom(){
		System.out.println("entering goto_requirement_form.do");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user_project_postreq_form");
		
		Map<String, Object> model = mav.getModel();
		return mav;
	}
	
	
}	
