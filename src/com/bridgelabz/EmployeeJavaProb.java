package com.bridgelabz;

public class EmployeeJavaProb {
	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NO_OF_WORKING_DAYS = 20;
	
	public static void main(String[] args)
	{
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
	for (int day=0; day<NO_OF_WORKING_DAYS; day++ )
	{
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

		switch (empCheck)
		{
		case IS_FULLTIME:
			empHrs = 8;
			break;
		case IS_PARTTIME:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println("Emp Wage: " + empWage);
	}
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}

}
