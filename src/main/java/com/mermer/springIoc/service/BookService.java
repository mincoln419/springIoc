package com.mermer.springIoc.service;

import java.time.LocalDateTime;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mermer.springIoc.aop.PerfLogging;
import com.mermer.springIoc.repository.BookRepository;
import com.mermer.springIoc.status.BookStatus;
import com.mermer.springIoc.vo.Book;
import com.mermer.springIoc.vo.BookDto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <pre>
 * com.mermer.springIoc.service
 * BookService.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 13. 오후 2:05:39
 * @desc    : 
 * @version : x.x
 */
@Service
@AllArgsConstructor
public class BookService {

	final public BookRepository bookRepository;
	
	
	@PerfLogging
	public Book save(BookDto bookdto) {
		Book book = new Book();
		book.setName(bookdto.getName());
		book.setCreated(LocalDateTime.now());
		book.setStatus(BookStatus.DRAFT);
		return bookRepository.save(book);
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("======================");
		System.out.println("postConstruct -- hello");
		
		 
		
		
	}
	
	
}
