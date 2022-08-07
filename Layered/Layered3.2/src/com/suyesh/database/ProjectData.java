package com.suyesh.database;

import java.util.ArrayList;
import java.util.List;

import com.suyesh.bean.Project;

public class ProjectData {

	private static List<Project> projectList = new ArrayList<Project>();
	
	static {
		projectList.add(new Project(1, "AI", 0));
		projectList.add(new Project(2, "ML", 0)) ;
		projectList.add(new Project(3, "CLOUD", 0));
		projectList.add(new Project(4, "IOT", 0));
		projectList.add(new Project(5, "EMBEDDED", 0));
		projectList.add(new Project(6, ".NET", 0));
		projectList.add(new Project(7, "PYTHON", 0));
		projectList.add(new Project(8, "JAVA", 0));
		projectList.add(new Project(0, "No Project", 0));

	}
	
	public static List<Project> getProjectList() {
		return projectList;
	}
	
	public static void setEmployeeList(List<Project> projectList) {
		ProjectData.projectList = projectList;
	}
}