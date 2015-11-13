package com.athensoft.util.collection;

import java.util.Comparator;

import com.athensoft.ecomm.entity.project.Activity;

public class ActivityComparator implements Comparator<Activity>{
	@Override
	public int compare(Activity o1, Activity o2) {
		int flag = 0;
		if(o1.getActivityId() < o2.getActivityId()){
			flag = -1;
		}else if(o1.getActivityId() == o2.getActivityId()){
			flag = 0;
		}else{
			flag = 1;
		}
		//System.out.println(flag);
		return flag;
	}				
}
