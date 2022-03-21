package com.daimler.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.daimler.entity.StoryEntity;

@Repository
public interface StroyDao extends CrudRepository<StoryEntity, Integer>{
	

}
