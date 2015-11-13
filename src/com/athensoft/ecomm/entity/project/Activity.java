package com.athensoft.ecomm.entity.project;

public class Activity {
	private int activityId;
	private String activityName;
	private String activityDesc;
	private int activityStatus;
	private String activityStatusDesc;
	private int actorId;
	
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
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
	@Override
	public String toString() {
		return "Activity [activityId=" + activityId + ", activityName="
				+ activityName + ", activityDesc=" + activityDesc
				+ ", activityStatus=" + activityStatus
				+ ", activityStatusDesc=" + activityStatusDesc + ", actorId="
				+ actorId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + activityId;
		result = prime * result + activityStatus;
		result = prime * result + actorId;
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
		Activity other = (Activity) obj;
		if (activityId != other.activityId)
			return false;
		if (activityStatus != other.activityStatus)
			return false;
		if (actorId != other.actorId)
			return false;
		return true;
	}
	
	
}