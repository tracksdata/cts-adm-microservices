package com;

public class Employee {

	private static Employee emp;

	private Employee() {
		System.out.println("-- Employee object created with hash code " + this.hashCode());
	}

	public static Employee getEmployeeObject() {
		if (emp == null) {
			emp = new Employee();
			return emp;
		}
		return emp;
	}

	public void f1() {
		System.out.println("f1 method by " + this.hashCode());
	}

}
