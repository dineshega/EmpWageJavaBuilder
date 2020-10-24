package com.bridgelabz;

public class EmployeeJavaProb {

	public static void main(String[] args) {
		int IS_FULLTIME = 1;
		int IS_PARTTIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		double empCheck = (Math.floor(Math.random() * 10) % 3);

		if (empCheck == IS_FULLTIME) 
		{
			empHrs = 8;
		}
		else if (empCheck == IS_PARTTIME) 
		{
			empHrs = 4;
		}
		else 
		{
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}

}
