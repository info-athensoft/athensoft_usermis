package com.athensoft.ecomm.entity.project;

import java.util.ArrayList;
import java.util.List;

public class Task {
	private int taskId;
	private String taskName;
	private String taskDesc;
	private int taskStatus;
	private String taskStatusDesc;
	
	private List<Activity> activityList = new ArrayList<Activity>();
	
	public List<Activity> getActivityList() {
		return activityList;
	}
	public void setActivityList(List<Activity> activityList) {
		this.activityList = activityList;
	}
	public int getTaskId() {
		return taskId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + taskId;
		result = prime * result + taskStatus;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (taskId != other.taskId)
			return false;
		if (taskStatus != other.taskStatus)
			return false;
		return true;
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
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", taskDesc=" + taskDesc + ", taskStatus="
				+ taskStatus + ", taskStatusDesc=" + taskStatusDesc + ", activityList=" + activityList + "]";
	}
	
	
}
