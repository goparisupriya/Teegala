package com.tnsif.Hierachial;

public class Hierachial {
	class A{
		String A = "Variable of Class A";
		void a(){
			System.out.println("This is Class A");
		}
		
	}
	class B extends A{
		void b() {
			System.out.println("This is Class B extends Class A");
		}
		
	}
	class C extends A{
		void c() {
			System.out.println("This is Class C extends Class A");
		}
		
	}
	class D extends A{
		void d() {
			System.out.println("This is Class D extends Class A");
		}
		
	}
}
	