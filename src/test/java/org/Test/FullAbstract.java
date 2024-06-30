package org.Test;

interface Camera{
	public void camera();
}

interface Dslr extends Camera{
	public void canon();
}

public class FullAbstract implements Dslr{

	public void canon() {
		System.out.println("Canon");
	}
	public void camera() {
		System.out.println("Camera");
	}
	public static void main(String[] args) {
		FullAbstract obj = new FullAbstract();
		obj.camera();
		obj.canon();
	}
}
