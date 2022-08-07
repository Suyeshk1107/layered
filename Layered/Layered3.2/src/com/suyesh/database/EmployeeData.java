package com.suyesh.database;

import java.util.ArrayList;

import com.suyesh.bean.Employee;

public class EmployeeData {
	
	protected static ArrayList<Employee> employeeList=new ArrayList<Employee>();
	static {
		employeeList.add(new Employee(101, "AAAA", 0, 55000));
		employeeList.add(new Employee(102, "BBBB", 0, 55000));
		employeeList.add(new Employee(104, "DDDD", 0, 55000));
		employeeList.add(new Employee(103, "CCCC", 0, 55000));
		employeeList.add(new Employee(105, "EEEE", 0, 55000));
		
		
	}
	
	public static ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}
	
	public static void setEmployeeList(ArrayList<Employee> employeeList) {
		EmployeeData.employeeList = employeeList;
	}
}
