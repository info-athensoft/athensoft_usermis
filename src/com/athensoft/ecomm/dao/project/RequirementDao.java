package com.athensoft.ecomm.dao.project;

import java.util.List;

import com.athensoft.ecomm.entity.project.Requirement;

public interface RequirementDao {
	public List<Requirement> findAll();
	public List<Requirement> findAllByProjectId(int projectId);
	public Requirement findByReqId(long reqId);
	
	public long create(Requirement reqObj);
	public void update(Requirement reqObj);
	public void updateStatus(Requirement reqObj);	//mark deleted
	public void delete(Requirement reqObj);
	public void delete(long reqId);
	
}
