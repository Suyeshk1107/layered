package com.suyesh.service;

import java.util.HashSet;

import com.suyesh.bean.Employee;
import com.suyesh.bean.Project;

public interface EmployeeWithProjectsService {
	boolean allocateProject(Employee emp, Project prj);
	boolean reallocateProject(Employee emp, Project prj1, Project prj2);
	HashSet<Employee> getEmployeesByProjectID(Project project);
}
