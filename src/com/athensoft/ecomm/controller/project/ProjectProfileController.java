package com.athensoft.ecomm.controller.project;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.entity.project.ProjectProfile;
import com.athensoft.ecomm.service.project.ProjectProfileService;

@Controller
public class ProjectProfileController {
	ProjectProfileService projectProfileService;
	
	@Autowired
	public void setProjectProfileService(ProjectProfileService projectProfileService) {
		this.projectProfileService = projectProfileService;
	}

	@RequestMapping("/view_project_list.do")
	public ModelAndView viewProjectHistorcial(){
		System.out.println("entering view_project_list.do");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user_project_list");
		
		Map<String, Object> model = mav.getModel();
//		List<ProjectProfile> projectProfileList = projectProfileService.getProjectProfileList();
		
		//test 
		int custId = 10;
		List<ProjectProfile> projectProfileList = projectProfileService.getProjectProfileByCustId(custId);
		
		//test
		System.out.println("ProjectProfileList="+projectProfileList.size());
		
		model.put("projectProfileList",projectProfileList);
		return mav;
	}
}
