package com.mermer.springIoc.service;

import java.time.LocalDateTime;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mermer.springIoc.repository.BookRepository;
import com.mermer.springIoc.status.BookStatus;
import com.mermer.springIoc.vo.Book;

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
public class BookService {

	public BookRepository bookRepository;
	
	@Autowired	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public Book save(Book book) {
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
