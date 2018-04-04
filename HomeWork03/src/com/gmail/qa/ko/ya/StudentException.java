package com.gmail.qa.ko.ya;

public class StudentException extends Exception {

	@Override
	public String getMessage() {
		return "Can not add";
	}
}
