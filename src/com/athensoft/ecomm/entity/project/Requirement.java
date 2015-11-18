package com.athensoft.ecomm.entity.project;

import java.util.Date;

public class Requirement {
	private long reqId;			//PK
	private int projectId;		//FK
	private int reqType1;		//1:functional  2:non-functional
	private int reqType2;		//1.Front-end  2.Back-end  3.System
	private String reqNum;		//pattern ie  1.2.1   3.2    3.4.5
	private String reqLocation;
	private String reqTarget;
	private String reqDesc;
	private int requestRole;
	private Date requestDate;
	private int reqStatus;
	
	
	public long getReqId() {
		return reqId;
	}
	public void setReqId(long reqId) {
		this.reqId = reqId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getReqType1() {
		return reqType1;
	}
	public void setReqType1(int reqType1) {
		this.reqType1 = reqType1;
	}
	public int getReqType2() {
		return reqType2;
	}
	public void setReqType2(int reqType2) {
		this.reqType2 = reqType2;
	}
	public String getReqLocation() {
		return reqLocation;
	}
	public void setReqLocation(String reqLocation) {
		this.reqLocation = reqLocation;
	}
	public String getReqTarget() {
		return reqTarget;
	}
	public void setReqTarget(String reqTarget) {
		this.reqTarget = reqTarget;
	}
	public String getReqDesc() {
		return reqDesc;
	}
	public void setReqDesc(String reqDesc) {
		this.reqDesc = reqDesc;
	}
	public int getRequestRole() {
		return requestRole;
	}
	public void setRequestRole(int requestRole) {
		this.requestRole = requestRole;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public int getReqStatus() {
		return reqStatus;
	}
	public void setReqStatus(int reqStatus) {
		this.reqStatus = reqStatus;
	}
	public String getReqNum() {
		return reqNum;
	}
	public void setReqNum(String reqNum) {
		this.reqNum = reqNum;
	}
	
	
	
}
