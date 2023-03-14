package com.mermer.springIoc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mermer.springIoc.editor.BookConverter;
import com.mermer.springIoc.editor.BookFormatter;

/**
 * <pre>
 * com.mermer.springIoc.config
 * WebConfig.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 14. 오후 4:27:45
 * @desc    : 
 * @version : x.x
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{

	@Override
	public void addFormatters(FormatterRegistry registry) {
		//registry.addConverter(new BookConverter.StringToBookConverter());
		//registry.addConverter(new BookConverter.BookToStringConverter());
		registry.addFormatter(new BookFormatter());
	}
}
