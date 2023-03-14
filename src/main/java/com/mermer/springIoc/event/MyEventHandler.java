package com.mermer.springIoc.event;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * com.mermer.springIoc.event
 * MyEventHandler.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 14. 오전 9:59:58
 * @desc    : 
 * @version : x.x
 */
@Component
public class MyEventHandler {

	@EventListener
	@Order(Ordered.HIGHEST_PRECEDENCE  + 2)
	@Async
	public void handle(MyEvent event) {
		System.out.println(Thread.currentThread().toString());
		System.out.println(event.getData());
	}

}
