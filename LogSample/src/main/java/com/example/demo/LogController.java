package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
	private static final Logger LOG = LoggerFactory.getLogger(LogController.class);

	@GetMapping("/testLogLevel")
	public String testLogLevel() {
		LOG.trace("This is a TRACE log");
		LOG.debug("This is a DEBUG log");
		LOG.info("This is an INFO log");
		LOG.error("This is an ERROR log");
		return "Added some log output to console...";
	}

}
