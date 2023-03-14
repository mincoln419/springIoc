package com.mermer.springIoc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mermer.springIoc.repository.BookRepository;
import com.mermer.springIoc.repository.TestBookRepository;

/**
 * <pre>
 * com.mermer.springIoc.config
 * ProfileConfig.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 14. 오전 8:46:44
 * @desc    : 
 * @version : x.x
 */
//@Configuration
//@Profile("test")
public class TestProfileConfig {
	
	@Bean
	public BookRepository bookRepository() {
		return new TestBookRepository();
	}

}
