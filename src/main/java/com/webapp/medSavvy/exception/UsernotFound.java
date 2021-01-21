package com.webapp.medSavvy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class UsernotFound extends RuntimeException {
	
	private static final long serialVersionUID=1L;
	
	

	public UsernotFound(String message) {
		super(message);
	}

}
