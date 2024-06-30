package org.Test;

interface Desktop{
	public void desk();
}

interface Laptop{
	public void lap();
}


public class Multiple implements Desktop, Laptop{

	public void lap() {
		System.out.println("Laptop");
	}

	public void desk() {
		System.out.println("Desktop");
	}
	
	public static void main(String[] args) {
		Multiple obj = new Multiple();
		obj.desk();
		obj.lap();
	}

}
