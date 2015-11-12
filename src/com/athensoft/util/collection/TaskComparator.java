package com.athensoft.util.collection;

import java.util.Comparator;

import com.athensoft.ecomm.entity.project.Task;

public class TaskComparator implements Comparator<Task>{
	@Override
	public int compare(Task o1, Task o2) {
		int flag = 0;
		if(o1.getTaskId() < o2.getTaskId()){
			flag = -1;
		}else if(o1.getTaskId() == o2.getTaskId()){
			flag = 0;
		}else{
			flag = 1;
		}
		//System.out.println(flag);
		return flag;
	}				
}
