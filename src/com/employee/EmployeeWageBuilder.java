package com.employee;

import java.util.Random;

class Employee {
	static final int IS_FULL_TIME = 1;// constants
	static final int IS_PART_TIME = 2;// constants
	static final int EMP_WAGE_PER_DAY = 20;
	static final int EMP_WAGE_FOR_MONTH = 20;
	static final int TOTAL_WRK_HRS_MONTH = 100;

	public static int empCheck() {
    	Random random = new Random();// random is object
    	int empCheck = random.nextInt(3);
    	return empCheck;
        }

	int empWrkHrs(int empCheck) {
    	int empWrkHrs;
    	switch (empCheck) {
    	case IS_FULL_TIME -> empWrkHrs = 8;
    	case IS_PART_TIME -> empWrkHrs = 4;
    	default -> empWrkHrs = 0;
    	}
    	return empWrkHrs;
    
    public static int  empWage(int empWrkHrs) {
    	int empWage = empWrkHrs * EMP_WAGE_PER_DAY; {
    	return empWage;
        }
    public static int totalEmpSalary() {
    	int day = 0;
    	int totalEmpSalary = 0;
    	int empWrkHrs = 0;
    	int empWage = 0;
    	int empCheck = 0;
    	int totalEmpWrkHrs = 0;
    	while (day < EMP_WAGE_FOR_MONTH && totalEmpWrkHrs < TOTAL_WRK_HRS_MONTH) {
    	    empCheck = empCheck();
    	    empWrkHrs = empWrkHrs(empCheck);
    	    empWage = empWage(empWrkHrs);
    	    totalEmpWrkHrs += empWrkHrs;
    	    ++day;
    	    totalEmpSalary += empWage;
    	}
    	return totalEmpSalary;
        }
    }
    public class EmployeeWageComputation {

        public static void main(String[] args) {
        	int totalEmpSalary;
        	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        	totalEmpSalary = Employee.totalEmpSalary();
        	System.out.println("totalEmpSalary = " + totalEmpSalary);
            }
        }
        }