package com.daimler.springbootdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.daimler.dao.StroyDao;
import com.daimler.entity.StoryEntity;
import com.daimler.pojo.Story;
import com.daimler.service.BusinessService;
import com.daimler.service.BusinessServiceImpl;
import com.daimler.util.EntityUtils;
import com.daimler.util.PojoUtils;

@SpringBootTest
class SpringbootdemoApplicationTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootdemoApplicationTests.class);
    Story story;
    @Autowired
	private BusinessService businessService;
    
    @Autowired
	private EntityUtils entityUtil;
	@Autowired
	private StroyDao stroyDao;
	@Autowired
	private PojoUtils pojoUtils;
	
	@Before(value = "story")
	public void prepareUSData() {
		story = new Story();
		story.setStoryName("dummy");
		story.setStoryNumber("1234");
		story.setStoryAssignDate("15/05/2020");
		story.setStoryAssigneeName("Amit");
		story.setStoryCreateDate("14/05/2020");
		story.setStoryCreatorName("Ram chandra");
		story.setStoryDescription("Display modal in register form for validate mobile number");
		story.setStoryOwner("Donald");
		
	}
    @Test
	public void testStoryName() {
		StoryEntity storyEntity = entityUtil.convertStoryPojoIntoEntity(story);
		if (storyEntity != null) {
			LOGGER.info("BusinessServiceImpl------->>> stroyDao.save() invoked : ");
			StoryEntity storyEntityTemp = stroyDao.save(storyEntity);
			LOGGER.info("BusinessServiceImpl------->>> US created...");
			Story story1 =  pojoUtils.convertStoryEntityIntoPojo(storyEntityTemp);
			System.out.println(" story1  : " + story1);
			assertEquals("test",story1.getStoryName());
		}
	}
    
    @After(value = "story")
	public void cleanUSData() {
    	story=null;
    }
}
