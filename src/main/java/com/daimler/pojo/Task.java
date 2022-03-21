package com.daimler.pojo;

import org.springframework.stereotype.Component;
@Component
public class Task {
	private Integer taskId;
	private String taskName;
	private String taskCreateDate;
	private String taskDescription;
	private String taskCreatorName;
	private String taskAssigneeName;
	private String taskAssignDate;
	private String taskNumber;
	private String storyNumber;
	private String taskOwner;
	
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskCreateDate() {
		return taskCreateDate;
	}
	public void setTaskCreateDate(String taskCreateDate) {
		this.taskCreateDate = taskCreateDate;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public String getTaskCreatorName() {
		return taskCreatorName;
	}
	public void setTaskCreatorName(String taskCreatorName) {
		this.taskCreatorName = taskCreatorName;
	}
	public String getTaskAssigneeName() {
		return taskAssigneeName;
	}
	public void setTaskAssigneeName(String taskAssigneeName) {
		this.taskAssigneeName = taskAssigneeName;
	}
	public String getTaskAssignDate() {
		return taskAssignDate;
	}
	public void setTaskAssignDate(String taskAssignDate) {
		this.taskAssignDate = taskAssignDate;
	}
	public String getTaskNumber() {
		return taskNumber;
	}
	public void setTaskNumber(String taskNumber) {
		this.taskNumber = taskNumber;
	}
	public String getStoryNumber() {
		return storyNumber;
	}
	public void setStoryNumber(String storyNumber) {
		this.storyNumber = storyNumber;
	}
	public String getTaskOwner() {
		return taskOwner;
	}
	public void setTaskOwner(String taskOwner) {
		this.taskOwner = taskOwner;
	}
	
	 

}
