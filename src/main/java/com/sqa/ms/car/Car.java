package com.sqa.ms.car;

public class Car {
	private int speed;
	boolean bullerProof;
	String color;
	boolean hasGasEngine;
	double marketValue;
	String name = "My First Car";
	int numWheels;
	String type = "toyota";

	public Car() {
		this.name = "my first car";
		this.type = "toyota";
		this.color = "blue";
		this.numWheels = 4;
		this.bullerProof = false;
		this.hasGasEngine = true;
		this.marketValue = 5900;
		this.speed = 35;
	}

	/**
	 * @param name
	 * @param type
	 * @param color
	 * @param numWheels
	 * @param bullerProof
	 * @param hasGasEngine
	 * @param marketValue
	 */
	public Car(String name, String type, String color, int numWheels, boolean bullerProof, boolean hasGasEngine,
			double marketValue, int speed) {
		super();
		this.name = name;
		this.type = type;
		this.color = color;
		this.numWheels = numWheels;
		this.bullerProof = bullerProof;
		this.hasGasEngine = hasGasEngine;
		this.marketValue = marketValue;
		this.speed = this.speed;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * @return the marketValue
	 */
	public double getMarketValue() {
		return this.marketValue;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the numWheels
	 */
	public int getNumWheels() {
		return this.numWheels;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return this.speed;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @return the bullerProof
	 */
	public boolean isBullerProof() {
		return this.bullerProof;
	}

	/**
	 * @return the hasGasEngine
	 */
	public boolean isHasGasEngine() {
		return this.hasGasEngine;
	}

	/**
	 * @param bullerProof
	 *            the bullerProof to set
	 */
	public void setBullerProof(boolean bullerProof) {
		this.bullerProof = bullerProof;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param hasGasEngine
	 *            the hasGasEngine to set
	 */
	public void setHasGasEngine(boolean hasGasEngine) {
		this.hasGasEngine = hasGasEngine;
	}

	/**
	 * @param marketValue
	 *            the marketValue to set
	 */
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param numWheels
	 *            the numWheels to set
	 */
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	/**
	 * @param speed
	 *            the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [name=");
		builder.append(this.name);
		builder.append(", speed=");
		builder.append(this.speed);
		builder.append(", bullerProof=");
		builder.append(this.bullerProof);
		builder.append(", color=");
		builder.append(this.color);
		builder.append(", hasGasEngine=");
		builder.append(this.hasGasEngine);
		builder.append(", marketValue=");
		builder.append(this.marketValue);
		builder.append(", numWheels=");
		builder.append(this.numWheels);
		builder.append(", type=");
		builder.append(this.type);
		builder.append("]");
		return builder.toString();
	}

	void initVehicle() {
		System.out.println("Initialize " + getColor() + " " + getType() + " cleaned up!");
	}

	int move() {
		System.out.println("you vehicle " + this.color + " " + this.type + " is moving " + this.speed + " mph");

		return this.speed * 5;
	}

	boolean reCharge() {
		if (this.hasGasEngine) {
			System.out.println("your " + getColor() + " " + getType() + " has enough gas");
			return true;
		} else {
			System.out.println("your" + getColor() + " " + getType() + " car needs to be charged");
			return false;
		}

	}

	boolean stop() {

		if (this.speed <= 0) {
			System.out.println("your vehicle stopped");
			return true;
		} else {
			System.out.println("your vehicle moving and not stopped");
			return false;
		}
	}

}
