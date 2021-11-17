package com.cg.entity;

import java.math.*;

public class Person{

protected String firstName;
protected String lastName;
protected char gender;
protected BigInteger phone;

public Person(String firstName,String lastName,char gender){
this.firstName=firstName;
this.lastName=lastName;
this.gender=gender;
}

//setters
public void setFirstName(String firstName){
this.firstName=firstName;
}
public void setLastName(String lastName){
this.lastName=lastName;
}
public void setGender(char gender){
this.gender=gender;
}
public void setPhone(BigInteger phone){
this.phone=phone;
}



//getters
public String getFirstName(){ return firstName;}
public String getLastName(){ return lastName;}
public char getGender(){return gender;}
public BigInteger getPhone(){return phone;}

public String toString(){
return "\nFirstName : "+getFirstName()+"\nLast Name : "+getLastName()+
	"\nGender : "+getGender();

}


}