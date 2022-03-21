package com.daimler.springbootdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.daimler.dao.StroyDao;

@SpringBootApplication( exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan({"com.daimler.*"})
@EnableJpaRepositories(basePackageClasses= {StroyDao.class})
@EntityScan("com.daimler.entity")
//@EnableScheduling
public class SpringbootdemoApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootdemoApplication.class);
	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootdemoApplication.class, args);
		LOGGER.info("SpringbootdemoApplication invoked");		
		
	}
	
}
