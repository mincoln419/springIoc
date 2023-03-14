package com.mermer.springIoc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mermer.springIoc.SpringIocApplication;
import com.mermer.springIoc.repository.BookRepository;
import com.mermer.springIoc.service.BookService;

/**
 * <pre>
 * com.mermer.springIoc.config
 * ApplicationConfig.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 13. 오후 4:54:54
 * @desc    : 
 * @version : x.x
 */
@Configuration
@ComponentScan(basePackageClasses = SpringIocApplication.class)
public class ApplicationConfig {

	
	
	
}
