package org.Test;
class Supe{
	public Supe() {
		this("method1");
		System.out.println("default method");
	}
	public Supe(String str) {
		System.out.println(str);
	}
	public void method() {
		System.out.println("Method2");
	}
	public void method(int i) {
		System.out.println("Method"+i);
	}
}

public class ThisSuper extends Supe{
	public ThisSuper() {
		super();
		super.method();
		super.method(3);
	}
	public static void main(String[] args) {
		ThisSuper obj1 = new ThisSuper();
	}
}
