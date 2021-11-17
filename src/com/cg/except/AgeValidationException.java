package com.cg.except;

public class AgeValidationException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1492304973925006127L;
	public AgeValidationException() {}
	public String toString(){

		return "Invalid Age : Age must be greater than or equal to 15 ";

		}
}
