package com.mermer.springIoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mermer.myservice.MyService;
import com.mermer.springIoc.config.ApplicationConfig;
import com.mermer.springIoc.service.AppRunner;
import com.mermer.springIoc.service.BookService;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
@EnableAsync
public class SpringIocApplication {

	
	public static void main(String[] args) {
	//	ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
				
		var app = new SpringApplication(SpringIocApplication.class);
		app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
			ctx.registerBean(MyService.class);
			ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("runner!"));
		});
//		
//		app.run(args).close();
		//BookService bookService = (BookService) context.getBean("bookService");
		//System.out.println(bookService.bookRepository);
		SpringApplication.run(SpringIocApplication.class, args).close();
	}
	
	
	@Bean
	public MessageSource messageSource() {
		var messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:/messages_en");
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(3);
		return messageSource;
	}

}
