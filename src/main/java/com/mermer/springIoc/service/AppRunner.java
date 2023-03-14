package com.mermer.springIoc.service;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.mermer.springIoc.event.MyEvent;
import com.mermer.springIoc.repository.BookRepository;
import com.mermer.springIoc.vo.Proto;
import com.mermer.springIoc.vo.Single;

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
		
	@Override
	public void run(ApplicationArguments args) {
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
		
	}
}
