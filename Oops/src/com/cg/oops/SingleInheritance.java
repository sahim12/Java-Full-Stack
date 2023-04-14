package com.cg.oops;

class Structure{
	public void Area() {
		System.out.println("Display Area");
	}
	class Rectangle extends Structure{       // Single level
		public void Area(int l, int b) {
			System.out.println(l*b);
		}
	}
	class Circle extends Structure{         // Hierarchial inheritance
		public void Area(int r) {
			System.out.println((3.14)*r*r);
			
		}
	}
}



public class SingleInheritance {

	public static void main(String[] args) {
		
	}

}
