package com.suyesh.persistence;

import java.util.List;

import com.suyesh.bean.Project;

public interface ProjectDao {
	
	Project searchProjectRecordById(int pId);
	List<Project> getAllProjectRecords();
}
