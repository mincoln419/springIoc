package com.mermer.springIoc.editor;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.mermer.springIoc.vo.Book;

/**
 * <pre>
 * com.mermer.springIoc.editor
 * BookFormatter.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 14. 오후 5:00:34
 * @desc    : 
 * @version : x.x
 */
public class BookFormatter implements Formatter<Book>{

	@Override
	public String print(Book book, Locale locale) {
		return book.getId().toString();
	}

	@Override
	public Book parse(String text, Locale locale) throws ParseException {
		Book book = new Book();
		book.setId(Long.parseLong(text));
		return book;
	}

}
