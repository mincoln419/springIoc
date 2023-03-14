package com.mermer.springIoc.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mermer.springIoc.event.MyEvent;
import com.mermer.springIoc.repository.BookRepository;
import com.mermer.springIoc.vo.Book;
import com.mermer.springIoc.vo.Proto;
import com.mermer.springIoc.vo.Single;
import com.mermer.springIoc.vo.validator.BookValidator;

/**
 * <pre>
 * com.mermer.springIoc.service
 * AppRunner.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 13. 오후 5:53:06
 * @desc    : 
 * @version : x.x
 */
@Component
public class AppRunner implements ApplicationRunner{

	@Autowired
	Single single;
	
	@Autowired
	Proto proto;
	
	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	BookRepository bookRepository; 
	
	@Value("${app.name}")
	String appName;
	
	@Autowired
	MessageSource messageSource;
	
	@Autowired
	ApplicationEventPublisher applicationEventPublisher;
	
	@Autowired
	ResourceLoader resourceLoader;
	
	@Autowired
	Validator validator;
		
	@Override
	public void run(ApplicationArguments args) throws IOException {
		System.out.println(single);
		System.out.println(proto);
		System.out.println(single.getProto());
		
		Environment env = ctx.getEnvironment();
		System.out.println("profiles" + env.getActiveProfiles());
		System.out.println("defautlt profiles" + env.getDefaultProfiles());

		System.out.println(env.getProperty("app.name"));
		System.out.println(env.getProperty("app.about"));
		
		System.out.println(appName);
		
//		while(true) {
//			System.out.println(messageSource.getMessage("greeting", new String[] {"mermer"}, Locale.KOREA)) ;
//			System.out.println(messageSource.getMessage("greeting", new String[] {"mermer"}, Locale.getDefault()));
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		applicationEventPublisher.publishEvent(new MyEvent(this, 400));
	
		
		Resource resource = resourceLoader.getResource("classpath:test.txt");
		System.out.println("exists:: " + resource.exists());
		System.out.println("filename:: " + resource.getDescription());
		System.out.println("path:: " + Files.readString(Path.of(resource.getURI())));
		
		System.out.println("getClass::" + resourceLoader.getClass());
		
		
		Book book = new Book();
		BookValidator bookValidator = new BookValidator();
		Errors errors = new BeanPropertyBindingResult(book, "book");
		bookValidator.validate(book, errors);
		System.out.println(errors.hasErrors());
		
		errors.getAllErrors().forEach(e ->{
			System.out.println(e.getCode());
			System.out.println(e.getDefaultMessage());
			System.out.println(e.getObjectName());
		});
		
		System.out.println(validator.getClass());
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression =  parser.parseExpression("2 + 100");
		Integer value = expression.getValue(Integer.class);
		System.out.println(value);
		
		
	}
}
