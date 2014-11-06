package com.multicampus.view.board;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.multicampus.biz.board.BoardVO;

public class BoardValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return true;
	}

	@Override
	public void validate(Object target, Errors errors) {
		BoardVO board = (BoardVO) target;
		
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "error.board.title");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "writer", "error.board.writer");

		if(board.getContent().length() < 10) {
			errors.rejectValue("content", "error.board.content");
		}

	}

}













