package designpattern.flyweight;

import java.awt.Color;

/**
 * https://www.baeldung.com/java-flyweight
 * 
 * 
 * For enable assert keyword:
 * To be specific:
	1) Go to Run->run configuration.
	2) select java application in left nav pan.
	3) right click and select New .
	4) select Arguments tab.
	5) Add -ea in VM arguments
	
	
 * @author Andrea
 *
 */
public class FlyweightMain {

	public static void main(String[] args) {
		Vehicle redVehicle1 = VehicleFactory.createVehicle(Color.RED);
		int hashCode1 = redVehicle1.hashCode();
		redVehicle1.start();
		
		Vehicle redVehicle2 = VehicleFactory.createVehicle(Color.RED);
		int hashCode2 = redVehicle2.hashCode();
		redVehicle2.stop();
		System.out.println(hashCode1);
		System.out.println(hashCode2);
		assert hashCode1 == hashCode2;
		System.out.println(redVehicle1.getColor());
	}

}
