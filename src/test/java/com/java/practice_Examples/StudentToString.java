package com.java.practice_Examples;

public class StudentToString {
	/*
	 * Define a student class with fields like name and age, and use toString to
	 * print student details
	 * 
	 */
	String name;
	int age;
	String rollNumber;
	String house;

	public StudentToString(String name, int age, String rollNumber, String house) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.house = house;
	}

	@Override
	public String toString() {
		return "Student Details:{name:" + name + ", age:" + age + ", roll number:" + rollNumber + ", house:" + house
				+ " }";
	}

	public static void main(String[] args) {
		StudentToString stu = new StudentToString("Prashant", 30, "001", "Shivaji");
		System.out.println(stu);
	}
}