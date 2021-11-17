package com.cg.eis.except;

public class EmployeeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2107833829177401861L;
	public EmployeeException() {}
	public String toString(){

		return "Invalid Employee : Minimum salary is 30000";

		}
}
