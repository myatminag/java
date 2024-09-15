package com.jdc.pos.features.exception;

public class InputValueInvalidException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InputValueInvalidException(String message) {
		super(message);
	}

}
