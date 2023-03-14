package com.mermer.springIoc.vo.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.mermer.springIoc.vo.Book;

/**
 * <pre>
 * com.mermer.springIoc.vo.validator
 * BookValidator.java
 * </pre>
 *
 * @author  : minco
 * @date    : 2023. 3. 14. 오후 1:43:38
 * @desc    : 
 * @version : x.x
 */
public class BookValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Book.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "not empty", "Empty name is not allowed");
		
	}

}
