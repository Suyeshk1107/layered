package com.suyesh.service;

import java.util.ArrayList;

import com.suyesh.bean.Employee;

public interface EmployeeService {
	
	Employee searchEmployeeRecordById(int empId);
	ArrayList<Employee> getAllEmployeeRecords();
	
	
}
