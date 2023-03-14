package com.mermer.springIoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mermer.springIoc.editor.BookEditor;
import com.mermer.springIoc.service.BookService;
import com.mermer.springIoc.vo.Book;
import com.mermer.springIoc.vo.BookDto;

@RestController
public class HelloController {

	@Autowired
	BookService bookService;
	
	@InitBinder
	public void init(WebDataBinder dataBinder) {
		dataBinder.registerCustomEditor(Book.class, new BookEditor());
	}
	
	@GetMapping("/")
	public String hello() {
		String hello = "Hello Spring";
		return hello;
	}
	
	@PostMapping("/book")
	public Book post(@RequestBody BookDto book) {
		
		Book result =  bookService.save(book);
		return result;
	}
	
	@GetMapping("/book/{book}")
	public Book selectBookById(@PathVariable Book book) {
		return book;
	}
}
