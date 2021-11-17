package com.cg.entity;

public class PersonClass {
	protected String name;
	protected float age;
	public PersonClass(){}
	public PersonClass(String name,float age){
	this.name=name;
	this.age=age;
	}
	public String toString(){
	return "Name: "+name+"\nage: "+age;
	}
}
