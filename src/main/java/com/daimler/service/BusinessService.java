package com.daimler.service;

import java.util.List;

import com.daimler.pojo.Story;
import com.daimler.pojo.Task;

public interface BusinessService {
	public Story createUserStory(Story Story);
	public Task createUserTask(Task Story);
	public Story fetchUniqueUS(Integer storyId);
	public List<Story> fetchAllUS();

}
