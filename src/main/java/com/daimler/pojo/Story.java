package com.daimler.pojo;

import org.springframework.stereotype.Component;

/* import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
*/
@Component
//@ApiModel(description="This is the Story pojo.")
public class Story {
	private int storyId;
	//private Task task;
	//@ApiModelProperty(notes = "The story name", position = 1)
	private String storyName;
	private String storyCreateDate;
	private String storyDescription;
	private String storyCreatorName;
	private String storyAssigneeName;
	private String storyAssignDate;
	private String storyNumber;
	private String storyOwner;
	
	/// @Autowired Constructor  Injection
	
	
//	public Task getTask() {
//		return task;
//	}
//	// @Autowired setter injection
//	public void setTask(Task task) {
//		this.task = task;
//	}
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
