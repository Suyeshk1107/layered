package com.suyesh.persistence;

import java.util.ArrayList;

import com.suyesh.bean.Employee;

public interface EmployeeDao {
	
	
	Employee searchEmployeeRecordById(int empId);
	ArrayList<Employee> getAllEmployeeRecords(); 
	
}
