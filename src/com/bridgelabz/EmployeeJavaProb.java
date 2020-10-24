package com.bridgelabz;

public class EmployeeJavaProb {
	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NO_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 160;
	public static void main(String[] args)
	{
		int empHrs = 0;
		int totalempHrs = 0;
		int totalWorkingDays = 0;
	while (totalempHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS)
	{
		totalWorkingDays++;
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
		totalempHrs += empHrs;
		System.out.println("Day " + totalWorkingDays + "\tEMP HRS: " + empHrs);
	}
	int totalempWage = totalempHrs * EMP_RATE_PER_HOUR;	
	System.out.println("total Emp Wage: " + totalempWage);
	}
}
