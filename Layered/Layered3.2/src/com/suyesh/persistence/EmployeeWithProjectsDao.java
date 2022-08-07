package com.suyesh.persistence;

import java.util.HashSet;

import com.suyesh.bean.Employee;
import com.suyesh.bean.Project;

public interface EmployeeWithProjectsDao {
	HashSet<Employee> getEmployeesByProjectID(Project project);
	boolean allocate(Employee emp, Project prj);
	boolean reallocate(Employee emp, Project prevPrj,Project newPrj);

}
