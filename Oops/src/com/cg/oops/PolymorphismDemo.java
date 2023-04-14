package com.cg.oops;

class Students{
	String name;
	int age;
	public void PrintInfo(String name) {
		System.out.println(name);
	}
	public void PrintInfo(int age) {
		System.out.println(age); 
	}
	public void PrintInfo(String name, int age) {
		System.out.println(name+ " "+ age);
	}
}

public class PolymorphismDemo {
	
	public static void main(String args[]) {
		Students s1=new Students();
		s1.name = "Sahim";
		s1.age = 22;
		 
		s1.PrintInfo(s1.name,s1.age);
	}
     
}
