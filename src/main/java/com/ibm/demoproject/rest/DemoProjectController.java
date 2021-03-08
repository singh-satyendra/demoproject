package com.ibm.demoproject.rest;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.demoproject.service.DemoProjectService;

@RestController
public class DemoProjectController
{
	@Autowired
	private DemoProjectService demoProjectService;
	
	private final Logger logger = LoggerFactory.getLogger(DemoProjectController.class);
	
	public DemoProjectController() {
	}

    @RequestMapping(value = "/demo")
	public ResponseEntity<?> demo() {
    	logger.info("Entered DemoProjectController.demo()");
    	String demoData = this.demoProjectService.demo();
    	ResponseEntity<String> responseEntity = new ResponseEntity<String>(demoData, HttpStatus.OK); 
    	logger.info("Leaving DemoProjectController.demo()");
    	return responseEntity;

    }
}
