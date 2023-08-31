package com.canara;

public class InvalidChoiceException extends RuntimeException {
	
	private String msg;

	public InvalidChoiceException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}

}
