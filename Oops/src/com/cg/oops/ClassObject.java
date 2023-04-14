package com.cg.oops;

public class ClassObject {

	public static void main(String[] args) {
		Student s1=new Student("swift",13);
		
	    s1.Info();
		
	}

}
class Student{
	String name;
	int age;
	public void Info(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student(String name, int age) {   // Parameterised Constructor
		this.name = name;
		this.age = age;
	}
	
	}


