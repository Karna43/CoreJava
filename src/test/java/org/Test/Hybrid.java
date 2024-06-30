package org.Test;

interface Bike{
	public void bike();
}

interface Scooter{
	public void scooter();
}

class Spec{
	public void spec() {
		System.out.println("Speed: 100km/hr");
	}
}

public class Hybrid extends Spec implements Bike, Scooter{

	public void bike() {
		System.out.println("Bike");
	}
	public void scooter() {
		System.out.println("Scooter");
	}
	public static void main(String[] args) {
		Hybrid obj = new Hybrid();
		obj.bike();
		obj.scooter();
		obj.spec();
	}
}
