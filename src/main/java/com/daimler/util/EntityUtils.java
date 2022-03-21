package com.daimler.util;

import org.springframework.stereotype.Component;

import com.daimler.entity.StoryEntity;
import com.daimler.entity.TaskEntity;
import com.daimler.pojo.Story;
import com.daimler.pojo.Task;

@Component
public class EntityUtils {
	
	public StoryEntity convertStoryPojoIntoEntity(Story story) {
		if (story != null) {
			StoryEntity storyEntity =  new StoryEntity();
			storyEntity.setStoryAssignDate(story.getStoryAssignDate() != null ? story.getStoryAssignDate(): null);
			storyEntity.setStoryAssigneeName(story.getStoryAssigneeName() != null ? story.getStoryAssigneeName() : null);
			storyEntity.setStoryCreateDate(story.getStoryCreateDate() != null ? story.getStoryCreateDate() : null);
			storyEntity.setStoryCreatorName(story.getStoryCreatorName() != null ? story.getStoryCreatorName() : null);
			storyEntity.setStoryDescription(story.getStoryDescription() != null ? story.getStoryDescription() : null);
			storyEntity.setStoryId(story.getStoryId() != 0 ? story.getStoryId() : 0);
			storyEntity.setStoryName(story.getStoryName() != null ? story.getStoryName() : null);
			storyEntity.setStoryNumber(story.getStoryNumber() != null ? story.getStoryNumber() : null);
			storyEntity.setStoryOwner(story.getStoryOwner() != null ? story.getStoryOwner() : null);
			//storyEntity.setTask(null);
			return storyEntity;
		} else { 
			return null;
					
		}
	}
	
	public TaskEntity convertTaskPojoIntoEntity(Task task) {
		return null;
	}
	
	private String checkNull(String obj) {
	    if (obj != null || !obj.equals("")) {
	    	return obj;	
	    } else {
	      return null;
	    }
	
	}
	
}
