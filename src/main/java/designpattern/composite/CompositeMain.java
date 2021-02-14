package designpattern.composite;

import designpattern.composite.computer.Component;
import designpattern.composite.computer.Composite;
import designpattern.composite.computer.Leaf;

public class CompositeMain {

	public static void main(String[] args) {
		Component hdd = new Leaf("HDD", 4000);
		Component mouse = new Leaf("Mouse", 300);
		Component monitor = new Leaf("Monitor", 5000);
		Component ram = new Leaf("Ram", 2000);
		Component cpu = new Leaf("CPU", 3500);
		
		Composite ph = new Composite("Peripherical");
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		Composite mb = new Composite("Motherboard");
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		Composite cabinet = new Composite("Cabinet");
		cabinet.addComponent(hdd);
		cabinet.addComponent(mb);
		
		
		Composite computer = new Composite("Computer");
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
		
		
		
		
	}

}
