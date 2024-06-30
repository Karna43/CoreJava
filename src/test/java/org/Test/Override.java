package org.Test;

class Realme{
	public void mobile() {
		System.out.println("Realme");
	}
}

public class Override extends Realme{
	public void mobile() {
		System.out.println("Redmi");
	}
	public static void main(String[] args) {
		Override obj = new Override();
		obj.mobile();
	}
}
