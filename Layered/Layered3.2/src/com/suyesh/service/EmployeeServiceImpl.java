package com.suyesh.service;

import java.util.ArrayList;

import com.suyesh.bean.Employee;
import com.suyesh.persistence.EmployeeDao;
import com.suyesh.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao = new EmployeeDaoImpl();

	@Override
	public Employee searchEmployeeRecordById(int empId) {
		// TODO Auto-generated method stub
		return employeeDao.searchEmployeeRecordById(empId);
	}

	@Override
	public ArrayList<Employee> getAllEmployeeRecords() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployeeRecords();
	}

	
}