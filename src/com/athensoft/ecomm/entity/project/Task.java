package com.athensoft.ecomm.entity.project;

import java.util.List;

public class Task {
	private int taskId;
	private String taskName;
	private String taskDesc;
	private int taskStatus;
	private String taskStatusDesc;
	
	private List<Activity> activityList;
	
	public List<Activity> getActivityList() {
		return activityList;
	}
	public void setActivityList(List<Activity> activityList) {
		this.activityList = activityList;
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
}
