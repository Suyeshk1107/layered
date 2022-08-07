package com.suyesh.bean;

public class Project {
	
	private int projectId;
	private int count;
	private String nameOfProject;
	
	public Project() {
		super();
	}
	
	public Project(int projectId, String nameOfProject, int count) {
		super();
		this.setProjectId(projectId);
		this.setNameOfProject(nameOfProject);
		this.setCount(count);
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getNameOfProject() {
		return nameOfProject;
	}

	public void setNameOfProject(String nameOfProject) {
		this.nameOfProject = nameOfProject;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", count=" + count + ", nameOfProject=" + nameOfProject + "]";
	}
	
	
}
