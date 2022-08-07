package com.suyesh.bean;

import java.util.Objects;

public class Employee {

	private int empId;
	private String empName;
	private int pId;
	private double salary;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String empName, int pId, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.pId = pId;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", pId=" + pId + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, pId, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName) && pId == other.pId
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
}
