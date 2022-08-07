package com.suyesh.database;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.suyesh.bean.Employee;
import com.suyesh.bean.Project;

public class EmployeeWithProjectsDatabase {

	static Map<Project,HashSet<Employee>> employeeWithProjects = new HashMap<Project,HashSet<Employee>>();
	static {
		
		List<Project> proj  = ProjectData.getProjectList(); 
		
		List<Employee> emp =EmployeeData.getEmployeeList();
		
		HashSet<Employee> emp1 = new HashSet<Employee>();
		
		emp1.addAll(emp);
		employeeWithProjects.put(proj.get(0), emp1);
	}
	
	public static Map<Project, HashSet<Employee>> getProjectEmployee() {
		return employeeWithProjects;
	}

	public static void setProjectEmployee(Map<Project, HashSet<Employee>> projectEmployee) {
		employeeWithProjects = projectEmployee;
	}
}
