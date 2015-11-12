package com.athensoft.ecomm.entity.project;

import java.util.List;

public class Phase{
	private int phaseId;
	private String phaseName;
	private String phaseDesc;
	private int phaseStatus;
	private String phaseStatusDesc;
	
	private List<Task> taskList;
	
	public List<Task> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + phaseId;
		result = prime * result + phaseStatus;
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
		Phase other = (Phase) obj;
		if (phaseId != other.phaseId)
			return false;
		if (phaseStatus != other.phaseStatus)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Phase [phaseId=" + phaseId + ", phaseName=" + phaseName + ", phaseDesc=" + phaseDesc + ", phaseStatus="
				+ phaseStatus + ", phaseStatusDesc=" + phaseStatusDesc + ", taskList=" + taskList + "]";
	}
}
