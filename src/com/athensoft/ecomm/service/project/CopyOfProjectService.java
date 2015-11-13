package com.athensoft.ecomm.service.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.ecomm.dao.project.ProjectPhaseTaskActivityDao;
import com.athensoft.ecomm.entity.project.Phase;
import com.athensoft.ecomm.entity.project.Project;
import com.athensoft.ecomm.entity.project.ProjectPhaseTaskActivity;
import com.athensoft.ecomm.entity.project.Task;
import com.athensoft.util.collection.PhaseComparator;
import com.athensoft.util.collection.TaskComparator;

@Service
public class CopyOfProjectService {
	private ProjectPhaseTaskActivityDao projectPhaseTaskActivityDao;
	
	@Autowired
	@Qualifier("projectPhaseTaskActivityDaoParam")
	public void setProjectPhaseTaskActivityDao(ProjectPhaseTaskActivityDao projectPhaseTaskActivityDao) {
		this.projectPhaseTaskActivityDao = projectPhaseTaskActivityDao;
	}
	
	public Project getProjectById(int projectId){
		Project project = new Project();
		
		List<Phase> phaseList = new ArrayList<Phase>();
		//populate phase list
			List<ProjectPhaseTaskActivity> projectDetailList = getProjectDetailList(projectId); 
			Set<Phase> phaseSet = new HashSet<Phase>();			

			for(ProjectPhaseTaskActivity projectDetail : projectDetailList){
				Phase phase = new Phase();
				phase.setPhaseId(projectDetail.getPhaseId());
				phase.setPhaseName(projectDetail.getPhaseName());
				phase.setPhaseDesc(projectDetail.getPhaseDesc());
				phase.setPhaseStatus(projectDetail.getPhaseStatus());
				
				
				List<Task> taskList = new ArrayList<Task>();				
				Set<Task> taskSet = new HashSet<Task>();
				for(ProjectPhaseTaskActivity projectDetail_2 : projectDetailList){
					if(projectDetail_2.getPhaseId()!=phase.getPhaseId()){
						continue;
					}
					Task task = new Task();
					task.setTaskId(projectDetail_2.getTaskId());
					task.setTaskName(projectDetail_2.getTaskName());
					
					taskSet.add(task);
					task = null;
				}
				taskList.addAll(taskSet);
				Collections.sort(taskList, new TaskComparator());
				
				phase.getTaskList().addAll(taskList);
				phaseSet.add(phase);				
				phase = null;
			}

			phaseList.addAll(phaseSet);			
			Collections.sort(phaseList, new PhaseComparator());
			
			//test
			Iterator<Phase> phaseListIterator = phaseList.iterator();
			while(phaseListIterator.hasNext()){
				System.out.println(phaseListIterator.next().toString());
			}
		
		project.setPhaseList(phaseList);
		return project;
	}
	
	private List<ProjectPhaseTaskActivity> getProjectDetailList(int projectId){
		List<ProjectPhaseTaskActivity> projectDetailList = projectPhaseTaskActivityDao.findProjectDetailById(projectId);
		return projectDetailList;
	}
	
}
