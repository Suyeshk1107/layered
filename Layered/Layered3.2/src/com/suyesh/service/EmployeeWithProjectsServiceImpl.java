package com.suyesh.service;

import java.util.HashSet;

import com.suyesh.bean.Employee;
import com.suyesh.bean.Project;
import com.suyesh.persistence.EmployeeWithProjectsDao;
import com.suyesh.persistence.EmployeeWithProjectsDaoImpl;

public class EmployeeWithProjectsServiceImpl implements EmployeeWithProjectsService {

	EmployeeWithProjectsDao employeeWithProjectsDao = new EmployeeWithProjectsDaoImpl();
	@Override
	public boolean allocateProject(Employee emp, Project prj) {
		// TODO Auto-generated method stub
		return employeeWithProjectsDao.allocate(emp, prj);
	}

	@Override
	public boolean reallocateProject(Employee emp, Project prj1, Project prj2) {
		// TODO Auto-generated method stub
		return employeeWithProjectsDao.reallocate(emp, prj1, prj2);
	}

	@Override
	public HashSet<Employee> getEmployeesByProjectID(Project project) {
		// TODO Auto-generated method stub
		return employeeWithProjectsDao.getEmployeesByProjectID(project);
	}

}
