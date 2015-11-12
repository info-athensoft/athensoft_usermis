package com.athensoft.ecomm.service.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

@Service
public class ProjectService {
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
				phaseSet.add(phase);
				phase = null;
			}

			phaseList.addAll(phaseSet);
			
			Collections.sort(phaseList, new Comparator<Phase>(){
				@Override
				public int compare(Phase o1, Phase o2) {
					int flag = 0;
					if(o1.getPhaseId() < o2.getPhaseId()){
						flag = -1;
					}else if(o1.getPhaseId() == o2.getPhaseId()){
						flag = 0;
					}else{
						flag = 1;
					}
					//System.out.println(flag);
					return flag;
				}				
			});
			
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
