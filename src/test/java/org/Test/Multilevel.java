package org.Test;

class Category{
	public void category(String str) {
		System.out.println("Category: "+str);
	}
}

class Mobile extends Category{
	public void mobile() {
		System.out.println("Mobile: Redmi");
	}
}

public class Multilevel extends Mobile{
	public void price() {
		System.out.println("Price: $1000");
	}
	public static void main(String[] args) {
		Multilevel obj1 =  new Multilevel();
		obj1.category("Mobiles");
		obj1.mobile();
		obj1.price();
	}

}
