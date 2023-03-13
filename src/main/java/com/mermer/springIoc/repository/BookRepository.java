package com.mermer.springIoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mermer.springIoc.vo.Book;

import lombok.Data;

/**
 * <pre>
 * com.mermer.springIoc.repository
 * BookRepository.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 13. 오후 2:05:50
 * @desc    : 
 * @version : x.x
 */
@Repository
public class BookRepository {
	
	public Book save(Book book) {
		return null;
	}
}
