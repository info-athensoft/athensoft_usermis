package com.athensoft.ecomm.controller.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.ecomm.entity.project.Requirement;
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
	
	@RequestMapping(value="/create_requirement.do", method=RequestMethod.POST, produces="application/json")
	@ResponseBody
	public Map<String, Object> createRequirement(@RequestParam String reqJSONString){
		System.out.println("entering create_requirement.do");
		
		ModelAndView mav = new ModelAndView();
		
		Map<String, Object> model = mav.getModel();
		
		Requirement reqObj = new Requirement();
		JSONObject j= new JSONObject(reqJSONString);
		reqObj.setProjectId(j.getInt("projectId"));
		reqObj.setReqType1(j.getInt("reqType1"));
		reqObj.setReqType2(j.getInt("reqType2"));
		reqObj.setReqNum(j.getString("reqNum"));		
		reqObj.setReqLocation(j.getString("reqLocation"));
		reqObj.setReqTarget(j.getString("reqTarget"));
		reqObj.setReqDesc(j.getString("reqDesc"));
		
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
		String strDate = j.getString("requestDate");
		Date requestDate = null;
		try {
			requestDate = ft.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		reqObj.setRequestDate(requestDate);
		reqObj.setRequestRole(j.getInt("requestRole"));
		reqObj.setReqStatus(j.getInt("reqStatus"));
		
		
		requirementService.createRequirement(reqObj);
		
		return model;
	}
	
	@RequestMapping(value="/search_requirement_all.do", method=RequestMethod.POST, produces="application/json")
	@ResponseBody
	public Map<String, Object> searchAllRequirement(){
		System.out.println("entering search_requirement_all.do");
		
		ModelAndView mav = new ModelAndView();
		
		Map<String, Object> model = mav.getModel();
		//todo
		int projectId = 2;  //test mtlpc
		List<Requirement> reqList = requirementService.getRequirementByProjectId(projectId);
		
		//teset
		model.put("reqList", reqList);
		return model;
	}
	
}	
