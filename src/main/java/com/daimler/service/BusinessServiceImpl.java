package com.daimler.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.daimler.dao.StroyDao;
import com.daimler.entity.StoryEntity;
import com.daimler.exception.RecordNotFoundException;
import com.daimler.pojo.Story;
import com.daimler.pojo.Task;
import com.daimler.util.EntityUtils;
import com.daimler.util.PojoUtils;

@Service
public class BusinessServiceImpl implements BusinessService {
	private static final Logger LOGGER = LoggerFactory.getLogger(BusinessServiceImpl.class);
	
	@Autowired
	private EntityUtils entityUtil;
	@Autowired
	private StroyDao stroyDao;
	@Autowired
	private PojoUtils pojoUtils;

	@Override
	public Story createUserStory(Story story) {
		LOGGER.info("BusinessServiceImpl------->>> createUserStory() invoked : ");
		StoryEntity storyEntity = entityUtil.convertStoryPojoIntoEntity(story);
		if (storyEntity != null) {
			LOGGER.info("BusinessServiceImpl------->>> stroyDao.save() invoked : ");
			StoryEntity storyEntityTemp = stroyDao.save(storyEntity);
			LOGGER.info("BusinessServiceImpl------->>> US created...");
			return pojoUtils.convertStoryEntityIntoPojo(storyEntityTemp);
		}
		
		return null;
	}

	@Override
	public Task createUserTask(Task Story) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Story fetchUniqueUS(Integer storyId) {
		Story story = null;
		if (storyId != null) {
			try {
			StoryEntity storyEntityTemp =  stroyDao.findById(storyId).get();
			if(storyEntityTemp != null) {
				story = pojoUtils.convertStoryEntityIntoPojo(storyEntityTemp);
			}
			} catch(Exception e) {
				LOGGER.error("Error occured ..... ", e);
			   throw new RecordNotFoundException("No Record found : " + storyId);
			}
		}
		return story;
		
	}

	@Override
	public List<Story> fetchAllUS() {
		List<StoryEntity> storyEntityTemp = (List<StoryEntity>) stroyDao.findAll();
		if (storyEntityTemp != null ) {
		return convertStoryEntityToStoryList(storyEntityTemp);
		} else {
			return null;
		}
	}
   
	private List<Story> convertStoryEntityToStoryList(List<StoryEntity> storyEntityTemp) {
		List<Story> storyList = new ArrayList<>();
		Iterator<StoryEntity> itr = storyEntityTemp.iterator();
		while (itr.hasNext()) {
			Story storyObj = pojoUtils.convertStoryEntityIntoPojo(itr.next());
			storyList.add(storyObj);
		}
		return storyList;
	}
}
