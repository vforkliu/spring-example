package com.forkliu.readinglist;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ReadinglistApplication {
	// private static final Logger logger = LoggerFactory.getLogger(ReadinglistApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ReadinglistApplication.class, args);
		// logger.debug("Hello world");
		log.info("Hello,World");
	}

}
