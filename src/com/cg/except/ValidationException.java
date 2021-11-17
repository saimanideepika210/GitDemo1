package com.cg.except;



public class ValidationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 479434680685797677L;
	public ValidationException() {}
	public String toString(){

		return "Invalid Name : Given First Name or Last Name as null ";

		}
	
}
