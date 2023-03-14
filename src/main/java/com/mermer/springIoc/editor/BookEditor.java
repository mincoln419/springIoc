package com.mermer.springIoc.editor;

import java.beans.PropertyEditorSupport;

import com.mermer.springIoc.vo.Book;

/**
 * <pre>
 * com.mermer.springIoc.editor
 * BookEditor.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 14. 오후 4:11:21
 * @desc    : 그냥 bean으로 등록해서 쓰면 안됨 - thread scope 으로 처리하면 가능
 * @version : x.x
 */
public class BookEditor extends PropertyEditorSupport{

	@Override
	public String getAsText() {
		Book book = (Book)getValue();
		return book.getId().toString();
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Book book = new Book();
		book.setId(Long.parseLong(text)); 
		setValue(book);
	}
	
}
