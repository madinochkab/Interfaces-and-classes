/**
 *   File Name: ShapeTests.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 6, 2016
 *
 */

package com.sqa.ms.shapes;

import org.junit.*;

/**
 * ShapeTests //ADDD (description of class)
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
public class ShapeTests {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		IShape[] shapes = { new Circle(), new Square(), new Circle(), new Square(), new Circle("little circle", "Blue"),
				new Square("lil square", "red", 15), new Circle("big  circle", "green", 200),
				new Square("big square", "yellow") };
		for (IShape shape : shapes) {
			System.out.println(shape.toString() + " Area " + String.format("%,.2f", shape.calcArea()));

		}
	}

}
