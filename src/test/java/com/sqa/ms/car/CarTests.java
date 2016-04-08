package com.sqa.ms.car;

import org.junit.*;

public class CarTests {

	@Test
	public void test() {
		Car[] cars = { new Car(), new Car("second car", "honda", "silver", 4, true, true, 3000, 35),
				new Car("RV car", "hyunday", "beige", 8, true, true, 80000, 90),
				new Car("vacation car", "mercedes", "red", 4, true, true, 80000, 90) };

		for (Car car : cars) {
			System.out.println(car);
			car.initVehicle();
			car.move();
			car.reCharge();
			car.stop();
		}
	}

}
