package com.employee;

import java.util.Random;

public class EmployeeWageBuilder {
	static final int PRESENT = 1;
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HOUR = 8;

	public static int empCheck() {
		Random random = new Random();
		int empCheck = random.nextInt(2);
		return empCheck;
	}

	public static void employeeWage() {
		int empWage = 0;
		int empcheck = empCheck();
		if (empcheck == PRESENT) {
			empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
		}
		System.out.println("The wage of employee is :  = " + empWage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage Builder");

		employeeWage();

	}
}