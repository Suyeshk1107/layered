package com.suyesh.persistence;

import java.util.HashSet;
import java.util.Map;

import com.suyesh.bean.Employee;
import com.suyesh.bean.Project;
import com.suyesh.database.EmployeeWithProjectsDatabase;

public class EmployeeWithProjectsDaoImpl implements EmployeeWithProjectsDao {

	@Override
	public HashSet<Employee> getEmployeesByProjectID(Project project) {
		Map<Project, HashSet<Employee>> mp = EmployeeWithProjectsDatabase.getProjectEmployee();

		return mp.get(project);
	}

	@Override
	public boolean allocate(Employee emp, Project prj) {
		if(emp.getpId() == 0 && prj.getCount() < 10) {
			emp.setpId(prj.getProjectId());
			prj.setCount(prj.getCount()+ 1);
			return true;
		}
		return false;
	}

	@Override
	public boolean reallocate(Employee emp, Project prevPrj, Project newPrj) {
		if(emp.getpId() != 0 && newPrj.getCount() < 10) {
			prevPrj.setCount(prevPrj.getCount() - 1);
			emp.setpId(newPrj.getProjectId());
			newPrj.setCount(newPrj.getCount() + 1);
			return true;
		}
		return false;
	}

}
