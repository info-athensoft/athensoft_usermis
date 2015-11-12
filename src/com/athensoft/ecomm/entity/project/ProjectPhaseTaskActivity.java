package com.athensoft.ecomm.entity.project;

public class ProjectPhaseTaskActivity {
	private int projectId ;
	private String projectCode;
	private String projectName;
	private String projectDesc;
	private int estimatedDuration; 	//by week
	private int duration;  			//by week
	private double estimatedCost;
	private double cost;
	private int projectStatus;		//mapping to project_status.status_no
	private String projectStatusName;
	
	private int phaseId;
	private String phaseName;
	private String phaseDesc;
	private int phaseStatus;
	private String phaseStatusDesc;
	
	private int taskId;
	private String taskName;
	private String taskDesc;
	private int taskStatus;
	private String taskStatusDesc;
	
	private int activityId;
	private String activityName;
	private String activityDesc;
	private int activityStatus;
	private String activityStatusDesc;
	private int actorId;
	
		
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public int getEstimatedDuration() {
		return estimatedDuration;
	}
	public void setEstimatedDuration(int estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getEstimatedCost() {
		return estimatedCost;
	}
	public void setEstimatedCost(double estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(int projectStatus) {
		this.projectStatus = projectStatus;
	}
	public String getProjectStatusName() {
		return projectStatusName;
	}
	public void setProjectStatusName(String projectStatusName) {
		this.projectStatusName = projectStatusName;
	}
	public int getPhaseId() {
		return phaseId;
	}
	public void setPhaseId(int phaseId) {
		this.phaseId = phaseId;
	}
	public String getPhaseName() {
		return phaseName;
	}
	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}
	public String getPhaseDesc() {
		return phaseDesc;
	}
	public void setPhaseDesc(String phaseDesc) {
		this.phaseDesc = phaseDesc;
	}
	public int getPhaseStatus() {
		return phaseStatus;
	}
	public void setPhaseStatus(int phaseStatus) {
		this.phaseStatus = phaseStatus;
	}
	public String getPhaseStatusDesc() {
		return phaseStatusDesc;
	}
	public void setPhaseStatusDesc(String phaseStatusDesc) {
		this.phaseStatusDesc = phaseStatusDesc;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDesc() {
		return taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}
	public int getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatusDesc() {
		return taskStatusDesc;
	}
	public void setTaskStatusDesc(String taskStatusDesc) {
		this.taskStatusDesc = taskStatusDesc;
	}
	public int getActivityId() {
		return activityId;
	}
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityDesc() {
		return activityDesc;
	}
	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}
	public int getActivityStatus() {
		return activityStatus;
	}
	public void setActivityStatus(int activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatusDesc() {
		return activityStatusDesc;
	}
	public void setActivityStatusDesc(String activityStatusDesc) {
		this.activityStatusDesc = activityStatusDesc;
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	
}
