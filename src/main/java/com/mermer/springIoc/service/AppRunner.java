package com.mermer.springIoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

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
	
	
	@Override
	public void run(ApplicationArguments args) {
		System.out.println(single);
		System.out.println(proto);
		System.out.println(single.getProto());
		
		Environment env = ctx.getEnvironment();
		System.out.println("profiles" + env.getActiveProfiles());
		System.out.println("defautlt profiles" + env.getDefaultProfiles());

	}
}
