package com.mermer.springIoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mermer.springIoc.vo.Book;

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
public interface BookRepository extends JpaRepository<Book, String>{

}
