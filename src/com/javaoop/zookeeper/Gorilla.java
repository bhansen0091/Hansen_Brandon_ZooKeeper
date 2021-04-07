package com.javaoop.zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("The gorilla has thrown something. (cost 5 energy)");
		this.changeEnergyLevel(-5);
	}
	
	public void eatBananas() {
		System.out.println("The gorilla ate some bananas and regained 10 energy.");
		this.changeEnergyLevel(10);
	}
	
	public void climb() {
		System.out.println("The gorilla climbed a tree. (cost 10 energy.)");
		this.changeEnergyLevel(-10);
	}
}
