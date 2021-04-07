package com.javaoop.zookeeper;

public class GiantBat extends Mammal{

	public GiantBat() {
		super.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("The Bat took off! (cost 50 energy)");
		this.changeEnergyLevel(-50);
	}
	
	public void eatHuman() {
		System.out.println("Gulp! (regained 25 energy)");
		this.changeEnergyLevel(25);
	}
	
	public void attackTown() {
		System.out.println("*Fire Sounds* (cost 100 eenergy)");
		this.changeEnergyLevel(-100);
	}
	
}
