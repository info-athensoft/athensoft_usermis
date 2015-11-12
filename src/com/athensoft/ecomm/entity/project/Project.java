package com.athensoft.ecomm.entity.project;

import java.util.List;

public class Project {
	private ProjectProfile projectProfile;
	private List<Phase> phaseList;
	
	public ProjectProfile getProjectProfile() {
		return projectProfile;
	}
	public void setProjectProfile(ProjectProfile projectProfile) {
		this.projectProfile = projectProfile;
	}
	public List<Phase> getPhaseList() {
		return phaseList;
	}
	public void setPhaseList(List<Phase> phaseList) {
		this.phaseList = phaseList;
	}
}
