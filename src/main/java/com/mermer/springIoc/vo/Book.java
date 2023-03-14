package com.mermer.springIoc.vo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.mermer.springIoc.status.BookStatus;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

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
@Entity
@Data
@SequenceGenerator(name = "SQ_BOOK_ID_GENERATOR", sequenceName = "SQ_BOOK_ID", initialValue = 1, allocationSize = 1)
@NoArgsConstructor
public class Book {
	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_BOOK_ID_GENERATOR")
	private Long id;
	
	@NonNull
	private String name;
	
	private LocalDateTime created;
	
	private BookStatus status;

}
