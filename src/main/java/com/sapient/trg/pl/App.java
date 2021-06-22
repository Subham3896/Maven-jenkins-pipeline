package com.sapient.trg.pl;

import java.time.LocalDate;

import com.sapient.trg.service.Person;

public class App 
{
    public static void main( String[] args ){
    	//creating instance/object of a class
    	//ClassName objectName= new ClassName();
    	//creating Person object using default constructor
    	
    	Person person1 = new Person();
    	person1.setPersonId(1);
    	person1.setFirtsName("Ravi");
    	person1.setLastName("Kumar");
    	System.out.println(person1.getPersonId()+","+person1.getFirtsName()+" "+person1.getLastName());
		System.out.println(person1.getMobile());
		//creating Person object using all-arg constructor
		Person person2= new Person(2,"Virat","Kohli",LocalDate.of(1996, 10,15),9808978989L);
		System.out.println(person2.getPersonId()+","+person2.getFirtsName()+" "+person2.getLastName());
		System.out.println(person2.getMobile());
    	
    	
    	
    }
}
