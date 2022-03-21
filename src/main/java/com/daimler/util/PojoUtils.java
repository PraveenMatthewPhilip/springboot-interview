package com.daimler.util;

import org.springframework.stereotype.Component;

import com.daimler.entity.StoryEntity;
import com.daimler.pojo.Story;

@Component
public class PojoUtils {
	public Story convertStoryEntityIntoPojo(StoryEntity storyEntity) {
		if (storyEntity != null) {
			Story story = new Story();
			story.setStoryAssignDate(storyEntity.getStoryAssignDate() !=null ? storyEntity.getStoryAssignDate() : null);
			story.setStoryAssigneeName(storyEntity.getStoryAssigneeName() != null ? storyEntity.getStoryAssigneeName() : null);
			story.setStoryCreateDate(storyEntity.getStoryCreateDate() != null ? storyEntity.getStoryCreateDate() : null);
			story.setStoryCreatorName(storyEntity.getStoryCreatorName() != null ? storyEntity.getStoryCreatorName() : null);
			story.setStoryDescription(storyEntity.getStoryDescription() != null ? storyEntity.getStoryDescription() : null);
			story.setStoryId(storyEntity.getStoryId() !=0 ? storyEntity.getStoryId(): 0);
			story.setStoryName(storyEntity.getStoryName() != null ? storyEntity.getStoryName() : null);
			story.setStoryNumber(storyEntity.getStoryNumber() != null ? storyEntity.getStoryNumber() : null);
			story.setStoryOwner(storyEntity.getStoryOwner() != null ? storyEntity.getStoryOwner() : null);
			//story.setTask(null);
			return story;
		} else {
			return null;
		}
		
	}
}
