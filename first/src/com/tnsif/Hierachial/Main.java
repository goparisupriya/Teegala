package com.tnsif.Hierachial;

public class Main {
	public static void main(String[] args) {
		
	    Hierachial outer = new Hierachial();
	    Hierachial.B objB = outer.new B();
	    Hierachial.C objC = outer.new C();
	    Hierachial.D objD = outer.new D();
	    objB.a();
	    objB.b();
	    objC.a();
	    objC.c();
	    objD.a();
	    objD.d();
	}
	}

