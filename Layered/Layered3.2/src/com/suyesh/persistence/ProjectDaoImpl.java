package com.suyesh.persistence;

import java.util.List;

import com.suyesh.bean.Project;
import com.suyesh.database.ProjectData;

public class ProjectDaoImpl implements ProjectDao{

	@Override
	public Project searchProjectRecordById(int prjId) {
		List<Project> project = ProjectData.getProjectList();
		for (Project p : project) {
			if (p.getProjectId() == prjId)
				return p;
		}
		return null;
	}

	@Override
	public List<Project> getAllProjectRecords() {
		return ProjectData.getProjectList();
	}


}
