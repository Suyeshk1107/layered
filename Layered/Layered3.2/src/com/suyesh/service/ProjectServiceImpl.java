package com.suyesh.service;

import java.util.List;

import com.suyesh.bean.Project;
import com.suyesh.persistence.ProjectDao;
import com.suyesh.persistence.ProjectDaoImpl;

public class ProjectServiceImpl implements ProjectService {

	ProjectDao projectDao = new ProjectDaoImpl();
	
	@Override
	public Project searchProject(int pId) {
		// TODO Auto-generated method stub
		return projectDao.searchProjectRecordById(pId);
	}

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return projectDao.getAllProjectRecords();
	}

}
