package com.suyesh.presentation;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.suyesh.bean.Employee;
import com.suyesh.bean.Project;
import com.suyesh.service.EmployeeService;
import com.suyesh.service.EmployeeServiceImpl;
import com.suyesh.service.ProjectService;
import com.suyesh.service.ProjectServiceImpl;
import com.suyesh.service.EmployeeWithProjectsServiceImpl;
import com.suyesh.service.EmployeeWithProjectsService;


public class PresentationImpl implements Presentation {

	private EmployeeService employeeService = new EmployeeServiceImpl();
	private ProjectService projectService = new ProjectServiceImpl();
	private EmployeeWithProjectsService employeeWithProjectsService = new EmployeeWithProjectsServiceImpl();
	
	private Employee empl;
	private Project prj;
	
	private int empid;
	private int pid;
	
	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Project Allocation Portal!!");
		System.out.println("1. Show all Employees");
		System.out.println("2. Show Employee by ID");
		System.out.println("3. Show all Projects");
		System.out.println("4. Show Project by ID");
		System.out.println("5. Allocate project to employee");
		System.out.println("6. Change project of Employee");
		System.out.println("7. Exit");
		
	}

	@Override
	public void performMenu(int choice) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			
			switch (choice) {
			case 1:
				ArrayList<Employee> employees = employeeService.getAllEmployeeRecords();
				for(Employee employee:employees) {
					System.out.println(employee);
				}
				break;

			case 2:
				System.out.println("Enter Employee ID : ");
				empid=sc.nextInt();
				empl=employeeService.searchEmployeeRecordById(empid);
				if(empl!=null) {
					System.out.println(empl);
				}
				else
					System.out.println("Employee with id "+empid+" does not exist");
				break;

			case 3:
				List<Project> projects = projectService.getAllProjects();
				for(Project project:projects) {
					System.out.println(project);
				}
				break;

			case 4:
				System.out.println("Enter Project ID : ");
				pid=sc.nextInt();
				prj=projectService.searchProject(pid);
				if(prj!=null) {
					System.out.println(prj);
				}
				else
					System.out.println("Project with id "+pid+" does not exist");
				break;

			case 5:
				System.out.println("Enter Employee ID: ");
				empid=sc.nextInt();
				empl=employeeService.searchEmployeeRecordById(empid);
				
				if(empl!=null) {
					
					System.out.println("Enter Project ID for allocation:");
					pid=sc.nextInt();
					prj=projectService.searchProject(pid);
					
					if(prj!=null) {
						
						if(employeeWithProjectsService.allocateProject(empl, prj)) {
							System.out.println("Project has been allocated !");
						}
						else {
							System.out.println("Project allocation was unsuccessful !");
						}
					}
					else {
						System.out.println("Project with id "+pid+" does not exist");
					}
					
				}
				else {
					System.out.println("Employee with id "+empid+" does not exist");
				}
				break;

			case 6:
				System.out.println("Enter Employee ID: ");
				empid=sc.nextInt();
				empl=employeeService.searchEmployeeRecordById(empid);
				
				if(empl!=null) {
					
					System.out.println("Enter Project ID for reallocation: ");
					pid=sc.nextInt();
					prj=projectService.searchProject(pid);
					
					if(prj!=null) {
						
						Project prj1 = projectService.searchProject(empl.getpId());
						if(employeeWithProjectsService.reallocateProject(empl, prj1, prj)){
							System.out.println("Project has been re-allocated !");
						}
						else {
							System.out.println("Project re-allocation was unsuccessful !");
						}
					}
					else {
						System.out.println("Project with id "+pid+" does not exist");
					}
					
				}
				else {
					System.out.println("Employee with id "+empid+" does not exist");
				}
				
				break;			
			case 7:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid selection");
				break;
			}
			
		} catch (Exception e) {
			
		}
	}

}
