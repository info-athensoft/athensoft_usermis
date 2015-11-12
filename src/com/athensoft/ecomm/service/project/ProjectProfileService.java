package com.athensoft.ecomm.service.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.ecomm.dao.project.ProjectProfileDao;
import com.athensoft.ecomm.entity.project.ProjectProfile;

@Service
public class ProjectProfileService {
	private ProjectProfileDao projectProfileDao;
		
	@Autowired
	@Qualifier("projectProfileDaoParam")
	public void setProjectProfileDao(ProjectProfileDao projectProfileDao) {
		this.projectProfileDao = projectProfileDao;
	}
	
	public List<ProjectProfile> getProjectProfileList(){
		List<ProjectProfile> projectProfileList = projectProfileDao.findAll();
		return projectProfileList;
	}
		
}

