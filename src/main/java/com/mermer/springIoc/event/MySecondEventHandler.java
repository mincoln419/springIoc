package com.mermer.springIoc.event;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * com.mermer.springIoc.event
 * MySecondEventHandler.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 14. 오전 10:06:36
 * @desc    : 
 * @version : x.x
 */
@Component
public class MySecondEventHandler {

	@EventListener
	@Order(Ordered.HIGHEST_PRECEDENCE)
	@Async
	public void handle(MyEvent event) {
		System.out.println(Thread.currentThread().toString());
		System.out.println("secondEvent" + event.getData());
	} 
}
