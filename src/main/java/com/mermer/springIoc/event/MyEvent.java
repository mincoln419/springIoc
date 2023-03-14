package com.mermer.springIoc.event;

import org.springframework.context.ApplicationEvent;

/**
 * <pre>
 * com.mermer.springIoc.event
 * MyEvent.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 14. 오전 9:56:29
 * @desc    : 
 * @version : x.x
 */
public class MyEvent{

	private int data;

	private Object source;
	
	
	public MyEvent(Object source, int data) {
		this.source = source;
		this.data = data;
	}

	public int getData() {
		return data;
	}
	
}
