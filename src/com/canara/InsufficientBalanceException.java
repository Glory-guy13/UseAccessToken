package com.canara;

public class InsufficientBalanceException  extends RuntimeException{
	
	private String msg;
	public InsufficientBalanceException(String msg) {
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}
}
