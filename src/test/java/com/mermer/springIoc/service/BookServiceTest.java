package com.mermer.springIoc.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mermer.springIoc.repository.BookRepository;
import com.mermer.springIoc.status.BookStatus;
import com.mermer.springIoc.vo.Book;

/**
 * <pre>
 * com.mermer.springIoc.service
 * BookServiceTest.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 13. 오후 3:50:17
 * @desc    : 
 * @version : x.x
 */
@SpringBootTest
class BookServiceTest {

	@Mock
	BookRepository bookRepository;
//	
//	@Test
//	void test() {
//		Book book = new Book();
//		
//		when(bookRepository.save(book)).thenReturn(book);
//		//BookRepository bookRepository = new BookRepository();
//		BookService bookService = new BookService(bookRepository);
//		Book result = bookService.save(book);
//		assertThat(result).isNotNull();
//		assertThat(book.getCreated()).isNotNull();
//		assertThat(book.getStatus()).isEqualTo(BookStatus.DRAFT);
//	}

}
