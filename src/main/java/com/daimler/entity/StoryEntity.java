package com.daimler.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Entity
@Component
@Table(name = "storyentity")
public class StoryEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int storyId;
	//@Column
	//private TaskEntity task;
	@Column
	private String storyName;
	@Column
	private String storyCreateDate;
	@Column
	private String storyDescription;
	@Column
	private String storyCreatorName;
	@Column
	private String storyAssigneeName;
	@Column
	private String storyAssignDate;
	@Column
	private String storyNumber;
	@Column
	private String storyOwner;
	
	/// @Autowired Constructor  Injection
	
	public int getStoryId() {
		return storyId;
	}
	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}
	
	public String getStoryName() {
		return storyName;
	}
	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}
	public String getStoryCreateDate() {
		return storyCreateDate;
	}
	public void setStoryCreateDate(String storyCreateDate) {
		this.storyCreateDate = storyCreateDate;
	}
	public String getStoryDescription() {
		return storyDescription;
	}
	public void setStoryDescription(String storyDescription) {
		this.storyDescription = storyDescription;
	}
	public String getStoryCreatorName() {
		return storyCreatorName;
	}
	public void setStoryCreatorName(String storyCreatorName) {
		this.storyCreatorName = storyCreatorName;
	}
	public String getStoryAssigneeName() {
		return storyAssigneeName;
	}
	public void setStoryAssigneeName(String storyAssigneeName) {
		this.storyAssigneeName = storyAssigneeName;
	}
	public String getStoryAssignDate() {
		return storyAssignDate;
	}
	public void setStoryAssignDate(String storyAssignDate) {
		this.storyAssignDate = storyAssignDate;
	}
	public String getStoryNumber() {
		return storyNumber;
	}
	public void setStoryNumber(String storyNumber) {
		this.storyNumber = storyNumber;
	}
	public String getStoryOwner() {
		return storyOwner;
	}
	public void setStoryOwner(String storyOwner) {
		this.storyOwner = storyOwner;
	}
	
	
	
	
    
	
}
