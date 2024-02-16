package com.encapsulationconcepts;

public class GetterClass {

	public static void main(String[] args) {
    Employee emp = new Employee("Shalini", "Y000", "Tester", 15);
    System.out.printf("%s, %s", emp.getEmpName(), emp.getEmpId());
    System.out.println();
    emp.setEmpName("ShaliniBhagat");
	}

}
