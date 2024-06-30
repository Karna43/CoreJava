package org.Test;

abstract class Tv{
	public abstract void brand();
	public void model() {
		System.out.println("Cystal Vision 4K");
	}
}

public class PartialAbstract extends Tv{
	public void brand() {
		System.out.println("Mi");
	}
	public static void main(String[] args) {
		PartialAbstract obj = new PartialAbstract();
		obj.brand();
		obj.model();
	}
	
}
