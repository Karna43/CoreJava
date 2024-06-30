package org.Test;

class Company{
	public void company() {
		System.out.println("Company: Xiaomi");
	}
}

class Redmi extends Company{
	public void mobile() {
		System.out.println("Mobile: Redmi");
	}
}

public class Hierarchical extends Company{
	public void mobile() {
		System.out.println("Mobile: Realme");
	}
	public static void main(String[] args) {
		Hierarchical obj1 =  new Hierarchical();
		Redmi obj2 = new Redmi();
		obj1.company();
		obj1.mobile();
		obj2.company();
		obj2.mobile();
	}

}
