package com.sqa.ms.people;

import org.junit.*;

public class PeopleTests {

	@Test
	public void test() {
		Person[] people = { new Person(), new Person("JF", 23, "11 111st st", "dev") };

		for (Person person : people) {
			System.out.println(person);
		}
	}

}
