package com.athensoft.util.collection;

import java.util.Comparator;

import com.athensoft.ecomm.entity.project.Phase;

public class PhaseComparator implements Comparator<Phase>{
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
}
