package org.Test;
class Parent{
	public Parent() {
		System.out.println("Parent");
	}
}

public class Construct extends Parent{
	static int c = 0;
	int a = 0;
	public Construct() {
		int b = 0;
		a++;
		b++;
		c++;
		System.out.println("a: "+a+", b: "+b+", c: "+c);
	}
	public Construct(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		Construct obj1 = new Construct("Raj");
		Construct obj2 = new Construct();
		Construct obj3 = new Construct();
	}
}
