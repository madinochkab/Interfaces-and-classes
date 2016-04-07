/**
 *   File Name: Circle.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 6, 2016
 *
 */

package com.sqa.ms.shapes;

/**
 * Circle //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Siebenthal, Madina
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Circle implements IShape {
	private String color = "white";
	private boolean ellipse = true;
	private String name = "default Circle";
	private int numSides = 0;
	private double radius;
	private String type = "circle";

	/**
	 *
	 */
	public Circle() {
		this.radius = 2;

	}

	/**
	 * @param color
	 * @param ellipse
	 * @param name
	 * @param numSides
	 * @param type
	 */
	public Circle(String name, String color) {
		super();
		this.color = color;
		this.name = name;
		this.radius = 10 / 2;

	}

	/**
	 * @param name
	 * @param color
	 * @param diameter
	 */
	public Circle(String name, String color, double diameter) {
		super();
		this.color = color;
		this.name = name;
		this.radius = diameter / 2;

	}

	/**
	 * @see com.sqa.ms.shapes.IShape#calcArea()
	 */
	@Override
	public double calcArea() {
		double area = Math.PI * this.radius * 2;

		return area;
	}

	/**
	 * @see com.sqa.ms.shapes.IShape#calcParameter()
	 */
	@Override
	public double calcParameter() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see com.sqa.ms.shapes.IShape#getColor()
	 */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.sqa.ms.shapes.IShape#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	/**
	 * @see com.sqa.ms.shapes.IShape#getNumSides()
	 */
	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see com.sqa.ms.shapes.IShape#getType()
	 */
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	/**
	 * @see com.sqa.ms.shapes.IShape#isEllipse()
	 */
	@Override
	public boolean isEllipse() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see com.sqa.ms.shapes.IShape#setColor(java.lang.String)
	 */
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.sqa.ms.shapes.IShape#setEllipse(boolean)
	 */
	@Override
	public void setEllipse(boolean ellipse) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.sqa.ms.shapes.IShape#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;

	}

	/**
	 * @see com.sqa.ms.shapes.IShape#setNumSides(int)
	 */
	@Override
	public void setNumSides(int numSides) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.sqa.ms.shapes.IShape#setType(java.lang.String)
	 */
	@Override
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [color=");
		builder.append(this.color);
		builder.append(", ellipse=");
		builder.append(this.ellipse);
		builder.append(", name=");
		builder.append(this.name);
		builder.append(", numSides=");
		builder.append(this.numSides);
		builder.append(", type=");
		builder.append(this.type);
		builder.append("]");
		return builder.toString();
	}

	// @Override
	// public String toString() {
	// return this.getClass().getSimpleName() + " - " + super.toString();
	// }

}
