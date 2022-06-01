package com.ecom.main;

 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.SpringServletContainerInitializer;

 
@SpringBootApplication
@Configuration
@EnableAutoConfiguration

@ComponentScan({"com.ecom.controller","com.ecom.service"})
@EntityScan("com.ecom.beans")
@EnableJpaRepositories("com.ecom.repository")
public class EcomProjectApplication extends SpringBootServletInitializer {
	 private static final Logger logger = LogManager.getLogger(EcomProjectApplication.class);
	public static void main(String[] args) {
		
		
		SpringApplication.run(EcomProjectApplication.class, args);
		logger.info("Info level log message");
		logger.debug("Debug level log message");
		logger.error("Error level log message");
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(EcomProjectApplication.class);
	}
	

}
