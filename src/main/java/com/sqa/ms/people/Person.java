package com.sqa.ms.people;

public class Person {

	public String address;
	public int age;
	public String jobTitle;

	public String name;

	public Person() {
		this.name = "Peter";
		this.age = 33;
		this.jobTitle = "SQA Engineer";
		this.address = "111 1st St, Daly City, CA, 95129";
	}

	/**
	 * @param name
	 * @param age
	 * @param address
	 * @param jobTitle
	 */
	public Person(String name, int age, String address, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return this.jobTitle;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(this.name);
		builder.append(", age=");
		builder.append(this.age);
		builder.append(", address=");
		builder.append(this.address);
		builder.append(", jobTitle=");
		builder.append(this.jobTitle);
		builder.append("]");
		return builder.toString();
	}

}
