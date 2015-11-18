package com.athensoft.ecomm.service.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.ecomm.dao.project.RequirementDao;
import com.athensoft.ecomm.entity.project.Requirement;

@Service
public class RequirementService {
	private RequirementDao requirementDao;
	
	@Autowired
	@Qualifier("requirementDaoParam")
	public void setRequirementDao(RequirementDao requirementDao) {
		this.requirementDao = requirementDao;
	}
	
	public List<Requirement> getRequirementByProjectId(int projectId){
		return requirementDao.findAllByProjectId(projectId);
	}
	
	public Requirement getRequirementById(long reqId){
		return requirementDao.findByReqId(reqId);
	}
	
	public long createRequirement(Requirement reqObj){
		return requirementDao.create(reqObj);
	}
	
	public void markDeleteRequirement(Requirement reqObj){
		requirementDao.updateStatus(reqObj);
	}
	
	public void updateRequirement(Requirement reqObj){
		requirementDao.update(reqObj);
	}
	
	public void deleteRequirement(Requirement reqObj){
		requirementDao.delete(reqObj);
	}
	
	public void deleteRequirement(long reqId){
		requirementDao.delete(reqId);
	}
	
}
