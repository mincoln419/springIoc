package com.mermer.springIoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.mermer.myservice.MyService;
import com.mermer.springIoc.config.ApplicationConfig;
import com.mermer.springIoc.service.AppRunner;
import com.mermer.springIoc.service.BookService;

@SpringBootApplication()
public class SpringIocApplication {

	
	@Autowired
	private MyService myService;
	
	@Autowired
	private AppRunner appRunner;
	
	public static void main(String[] args) {
	//	ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
				
		var app = new SpringApplication(SpringIocApplication.class);
		app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
			ctx.registerBean(MyService.class);
			ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("runner!"));
		});
		
		app.run(args);
		//BookService bookService = (BookService) context.getBean("bookService");
		//System.out.println(bookService.bookRepository);
	}

}
