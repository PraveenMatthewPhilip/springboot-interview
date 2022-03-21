package com.daimler.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.daimler.exception.RecordNotFoundException;
import com.daimler.pojo.Story;
import com.daimler.pojo.Task;
import com.daimler.service.BusinessService;
/*
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
*/
@RestController
@RequestMapping(path="/rest/api")
//@Api(value="Rest Controller Resource")
public class RestControllerResource {
	private static final Logger LOGGER = LoggerFactory.getLogger(RestControllerResource.class);
	@Autowired
	private BusinessService businessService;
	
	
	@PutMapping(value="updatestory", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> updateStory(@RequestBody Story stroy) {
		return null;
		
	}
	@PostMapping(value="createtask", consumes = "application/json", produces = "application/json")
//	@ApiOperation(value="createTask")
	public ResponseEntity<Object> createTask(@RequestBody Task task) {
		return null;
		
	}
	@PutMapping(value="updatetask", consumes = "application/json", produces = "application/json")
//	@ApiOperation(value="updateTask")
	public ResponseEntity<Object> updateTask(@RequestBody Task task) {
		return null;
		
	}
	
	
	@PostMapping(value="/createstory", consumes = "application/json", produces = "application/json")
	public Story createStory(@RequestBody Story stroy) {
		Story story =  businessService.createUserStory(stroy);
		if(story != null) {
			LOGGER.info("storyId ----> " + story.getStoryId());
			return story;
		} else {
			return null;
		}
		
	}
	
	
	@GetMapping(path="/fetchstory")
//	@ApiOperation(value="fetchStory")
	@ResponseBody
	public ResponseEntity<Story> fetchStory(@RequestParam(value = "id") Integer storyId ) {
		LOGGER.info("fetchUS() method invoked : storyId" + storyId);
		System.out.println("ID : " + storyId);
		Story stroy = businessService.fetchUniqueUS(storyId);
		if (stroy != null) {
			return new ResponseEntity<Story>(stroy, HttpStatus.OK);
		} else {
		         throw new RecordNotFoundException("Invalid story ID : " + storyId);
		}
	}
	
	@GetMapping(path="/fetchallstory")
//	@ApiOperation(value="fetchAllStoryData")
	@CrossOrigin
	public List<Story> fetchAllStory() {
		LOGGER.info("fetchAllStory() method invoked :");
		List<Story> storyList = businessService.fetchAllUS();
		if (storyList != null && !storyList.isEmpty()) {
			return storyList;
		} else {
			return null;
		}
	}
	
	
}
