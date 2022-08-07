package com.suyesh.persistence;

import java.util.ArrayList;
import java.util.List;

import com.suyesh.bean.Employee;
import com.suyesh.database.EmployeeData;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public Employee searchEmployeeRecordById(int empId) {
		List<Employee> employees=EmployeeData.getEmployeeList();
		for(Employee e:employees) {
			if(e.getEmpId()==empId)
				return e;
		}
		return null;
	}

	@Override
	public ArrayList<Employee> getAllEmployeeRecords() {
		// TODO Auto-generated method stub
		return EmployeeData.getEmployeeList();
	}
}
