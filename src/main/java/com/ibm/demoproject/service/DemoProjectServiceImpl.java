package com.ibm.demoproject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class DemoProjectServiceImpl implements DemoProjectService {
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(DemoProjectServiceImpl.class);
	
	@Value("${demoproperty.someproperty}")
	private String demoPropertySomeProperty;

	public DemoProjectServiceImpl() {
	}

	@Override
	public String demo() {
		logger.info("Entered DemoProjectServiceImpl.demo().  demoPropertySomeProperty=" + demoPropertySomeProperty);
		String demoData = "This is a demo.  demoproperty.someproperty=" + demoPropertySomeProperty;
		logger.info("Leaving DemoProjectServiceImpl.demo().  demoData=" + demoData);
		return demoData;
	}
}
