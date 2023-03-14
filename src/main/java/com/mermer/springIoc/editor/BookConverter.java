package com.mermer.springIoc.editor;

import org.springframework.core.convert.converter.Converter;

import com.mermer.springIoc.vo.Book;

/**
 * <pre>
 * com.mermer.springIoc.editor
 * BookConverter.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 14. 오후 4:22:37
 * @desc    : 
 * @version : x.x
 */
public class BookConverter {

	public static class StringToBookConverter implements Converter<String, Book>{

		@Override
		public Book convert(String text) {
			Book book = new Book();
			book.setId(Long.parseLong(text)); 
			return book;
		}
		
	} 
	
	public static class BookToStringConverter implements Converter<Book, String>{

		@Override
		public String convert(Book book) {
			return book.getId().toString();
		}
		
	} 
}
