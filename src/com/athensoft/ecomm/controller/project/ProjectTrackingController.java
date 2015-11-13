package com.athensoft.ecomm.controller.project;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.entity.project.Project;
import com.athensoft.ecomm.service.project.ProjectService;

@Controller
public class ProjectTrackingController {
	
	private ProjectService projectService;
	
	@Autowired
	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}


	@RequestMapping("/track_project.do")
	public ModelAndView trackProject(){
		System.out.println("entering track_project.do");
		
		ModelAndView mav = new ModelAndView();
//		mav.setViewName("user_track_project_tmp");
		mav.setViewName("user_track_project");
		
		Map<String, Object> model = mav.getModel();
		
		//test
		int projectId = 1;
		Project project = projectService.getProjectById(projectId);
		
		model.put("project", project);
		
		return mav;
	}
}
