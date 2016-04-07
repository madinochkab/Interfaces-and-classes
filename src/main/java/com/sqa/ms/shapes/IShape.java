/**
 *   File Name: IShape.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 6, 2016
 *
 */

package com.sqa.ms.shapes;

/**
 * IShape //ADDD (description of class)
 * <p>
 * Interfaces: Create the IShape Class with following memebrs (properties and
 * behaviors). Properties can not be added directly to interfaces so you'll want
 * to review how to go about adding them:
 *
 * Members:
 *
 * - Properties/ Fields/ Instance Variables:
 *
 * String name (any name you may give the instance - ex: "My First Shape")
 * String type (the type of shape - ex: circle, square, rectangle, triangle)
 * String color int numSides boolean eclipse
 *
 * - Functions/Methods:
 *
 * double calcArea(); double calcPerimeter();
 *
 * Part 2: Implementation: Create two classes which implement the IShape Class,
 * Circle and Square. Override the toString method and Create the following
 * constructors:
 *
 * Default, One that takes the name One that takes all properties
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Siebenthal, Madina
 * @version 1.0.0
 * @since 1.0
 *
 */
public interface IShape {
	public double calcArea();

	public double calcParameter();

	public String getColor();

	// private String color;
	// private boolean ellipse;
	// private String name;
	// private int numSides;
	// private String type;
	public String getName();

	public int getNumSides();

	public String getType();

	public boolean isEllipse();

	public void setColor(String color);

	public void setEllipse(boolean ellipse);

	public void setNumSides(int numSides);

	public void setType(String type);

	void setName(String name);

	// String type;

}
