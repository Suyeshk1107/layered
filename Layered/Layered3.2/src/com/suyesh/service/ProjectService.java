package com.suyesh.service;

import java.util.List;

import com.suyesh.bean.Project;

public interface ProjectService {

	Project searchProject(int pId);
	List<Project> getAllProjects();
}
