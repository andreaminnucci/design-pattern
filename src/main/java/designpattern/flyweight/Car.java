package designpattern.flyweight;


import java.awt.Color;


/**
 * Represents a car. This class is immutable.
 * 
 * @author Donato Rimenti
 */
public class Car implements Vehicle {

	/**
	 * The car's engine.
	 */
	private Engine engine;

	/**
	 * The car's color.
	 */
	private Color color;

	/**
	 * Instantiates a new Car.
	 *
	 * @param engine
	 *            the {@link #engine}
	 * @param color
	 *            the {@link #color}
	 */
	public Car(Engine engine, Color color) {
		this.engine = engine;
		this.color = color;

		// Building a new car is a very expensive operation!
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.err.println("Error while creating a new car");
			e.printStackTrace();
		}
	}

	@Override
	public void start() {
		System.out.println("Car is starting!");
		engine.start();
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping!");
		engine.stop();
	}

	@Override
	public Color getColor() {
		return this.color;
	}

}