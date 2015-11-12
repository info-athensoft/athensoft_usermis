package com.athensoft.ecomm.dao.project;

import java.util.List;

import com.athensoft.ecomm.entity.project.ProjectPhaseTaskActivity;

public interface ProjectPhaseTaskActivityDao {
	public List<ProjectPhaseTaskActivity> findProjectDetailById(int projectId);
}
