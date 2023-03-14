package com.mermer.springIoc.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * com.mermer.springIoc.vo
 * Proto.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 13. 오후 5:52:29
 * @desc    : 
 * @version : x.x
 */
@Component @Scope("prototype")
public class Proto {

	@Autowired
	private ApplicationContext ctx;
	
}
