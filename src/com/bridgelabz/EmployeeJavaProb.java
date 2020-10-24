package com.bridgelabz;


public class EmployeeJavaProb {
	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;
	private int totalempWage;
	private final String Company;
	private final int EMP_RATE_PER_HOUR;
	private final int NO_OF_WORKING_DAYS;
	private final int MAX_HRS_IN_MONTH;
	
	public EmployeeJavaProb(String cmp, int ERPH, int NOWD, int MHIM)
	{
		this.Company = cmp;
		this.EMP_RATE_PER_HOUR = ERPH;
		this.NO_OF_WORKING_DAYS = NOWD;
		this.MAX_HRS_IN_MONTH = MHIM;
	}
	
	public void EmployeeW()
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
			totalempWage = totalempHrs * EMP_RATE_PER_HOUR;	
			System.out.println("Total Employee Wage for Company " + Company + " is : " + totalempWage);
	}
public static void main(String[] args)
{
	EmployeeJavaProb TCS = new EmployeeJavaProb("TCS",20,20,160);
	EmployeeJavaProb HCL=new EmployeeJavaProb("HCL",24,23,150);
	EmployeeJavaProb Deliotte = new EmployeeJavaProb("Deliotte",28,23,140);
	TCS.EmployeeW();
	HCL.EmployeeW();
	Deliotte.EmployeeW();
}
}
