package com.bridgelabz;


public class EmployeeJavaProb implements InterfaceEmpWage {
	public int numOfCompanies = 0;
	
	CompanyEmpWage EmpWageArray[];
	public EmployeeJavaProb() {	
		EmpWageArray = new CompanyEmpWage[5];
	}
	@Override
	public void addComEmpWage(String company, int EMP_RATE_PER_HOUR, int NO_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH)
	{
		EmpWageArray[numOfCompanies] = new CompanyEmpWage(company, EMP_RATE_PER_HOUR, NO_OF_WORKING_DAYS, MAX_HRS_IN_MONTH);
		numOfCompanies++;
	}
	@Override
	public void computeEmpWage() {
		for (int i = 0; i < numOfCompanies; i++)
		{
			EmployeeW(EmpWageArray[i]);
		}
	}
	
	private void EmployeeW(CompanyEmpWage EmpWage)
	{
				int empHrs = 0;
				int totalempHrs = 0;
				int totalWorkingDays = 0;
			while (totalempHrs < EmpWage.MAX_HRS_IN_MONTH && totalWorkingDays < EmpWage.NO_OF_WORKING_DAYS)
			{
				totalWorkingDays++;
				int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		
				switch (empCheck)
				{
				case 1:
					empHrs = 8;
					break;
				case 2:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
				}
				totalempHrs += empHrs;
				System.out.println("Day " + totalWorkingDays + "\tEMP HRS: " + empHrs);
			}	
			int totalempWage =  totalempHrs * EmpWage.EMP_RATE_PER_HOUR;
			System.out.println("Total Employee Wage for Company " + EmpWage.Company + " is : " + totalempWage);
	}
public static void main(String[] args)
{


	InterfaceEmpWage cmp = new EmployeeJavaProb();
	cmp.addComEmpWage("TCS",20,20,160);

	cmp.addComEmpWage("HCL",25,23,120);
	
	cmp.addComEmpWage("Deliotte",30,24,110);
	
	cmp.computeEmpWage();
}
}
