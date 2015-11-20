package com.athensoft.ecomm.dao.project;

import java.util.List;

import com.athensoft.ecomm.entity.project.ProjectProfile;

public interface ProjectProfileDao {
	
	/**
	 * query all projects profiles
	 * @return
	 */
	public List<ProjectProfile> findAll();
	
	/**
	 * query all projects profiles that belong to specified customer with customer id
	 * @param custId
	 * @return
	 */
	public List<ProjectProfile> findByCustId(int custId);
}
