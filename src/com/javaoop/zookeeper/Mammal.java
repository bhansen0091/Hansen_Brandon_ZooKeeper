package com.javaoop.zookeeper;

public class Mammal {
	private int energyLevel = 100;

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public void changeEnergyLevel(int impact) {
		this.energyLevel += impact;
	}
	
	public void displayEnergyLevel() {
		System.out.println(this.energyLevel);
	}
	
}
