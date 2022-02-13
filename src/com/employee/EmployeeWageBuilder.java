package com.employee;

import java.util.Random;

public class EmployeeWageBuilder {
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	public static final int WAGE_PER_DAY = 20;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;

	public static void totalEmployeeWage() {
		EmployeeWageBuilder dMart = new EmployeeWageBuilder("dmart", 20, 20, 100);
		Random random = new Random();
		int totalWorkingDays = 0;
		int totalWorkingHours = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		while (totalWorkingDays < dMart.numOfWorkingDays && totalWorkingHours < dMart.maxHoursPerMonth) {
			totalWorkingDays++;
			int empCheck = random.nextInt(3);
			int empHrs = 0;
			switch (empCheck) {
			case PART_TIME -> empHrs = 4;
			case FULL_TIME -> empHrs = 8;
			default -> empHrs = 0;

			}
			totalWorkingHours = empHrs + totalWorkingHours;
			empWage = empHrs * dMart.empRatePerHour;
			System.out.println("Day " + totalWorkingDays + " = " + empWage);
			totalEmpWage = empWage + totalEmpWage;

		}
		System.out.println("Salary of " + dMart.company + " employee is " + totalEmpWage);
	}

	public EmployeeWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		super();
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public static void main(String[] args) {
		totalEmployeeWage();

	}
}