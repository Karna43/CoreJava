package org.Test;

public class Overload {
	
	public void load() {
		System.out.println("no arguments");
	}
	public void load(String name) {
		System.out.println("Department Name: "+name);
	}
	public void load(int mark) {
		System.out.println("Total Marks: "+mark);
	}
	public void load(String name, int mark) {
		System.out.println("Name: "+name+", Marks: "+mark);
	}
	public void load(int mark, String name) {
		System.out.println("Name: "+name+", Marks: "+mark);
	}
	
	public static void main(String[] args) {
		Overload obj = new Overload();
		obj.load();
		obj.load(100);
		obj.load("CSE");
		obj.load(80, "Sam");
		obj.load("Vicky", 90);
	}
}
