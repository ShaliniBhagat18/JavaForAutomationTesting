package com.encapsulationconcepts;

public class Employee {
	
	private String empName;  // public access
	private String empId;    // public access
	private String designation; //default
	private double salary; 
	
	
	public Employee(String empName, String empId, String designation, double salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.designation = designation;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String name) {
		if(name.equalsIgnoreCase("unknown")) {
			System.out.println("Not a valid emp name");
		}else {
			this.empName=name;
			System.out.println("This is valid name " +name);
		}
	}
	
	
	
	public String getEmpId() {
		return empId;
	}
}
