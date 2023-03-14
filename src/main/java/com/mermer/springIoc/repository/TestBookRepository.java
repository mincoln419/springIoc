package com.mermer.springIoc.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.mermer.springIoc.vo.Book;

/**
 * <pre>
 * com.mermer.springIoc.repository
 * TestBookRepository.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 14. 오전 8:47:22
 * @desc    : 
 * @version : x.x
 */
@Repository
@Profile("!prod")
public class TestBookRepository implements BookRepository{

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
