package com.mermer.springIoc.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * <pre>
 * com.mermer.springIoc.vo
 * Single.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 13. 오후 5:52:24
 * @desc    : 
 * @version : x.x
 */
@Component
@Data
public class Single {
	
	@Autowired
	private Proto proto;

}
