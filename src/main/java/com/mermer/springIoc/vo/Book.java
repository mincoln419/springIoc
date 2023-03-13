package com.mermer.springIoc.vo;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.mermer.springIoc.status.BookStatus;

import lombok.Data;

/**
 * <pre>
 * com.mermer.springIoc.vo
 * Book.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 13. 오후 2:07:17
 * @desc    : 
 * @version : x.x
 */
@Data
public class Book {
	
	@GeneratedValue @Id
	private String id;
	
	private String name;
	
	private LocalDateTime created;
	
	private BookStatus status;

}
