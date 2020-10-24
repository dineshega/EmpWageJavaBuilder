package com.bridgelabz;

public class CompanyEmpWage {
	
	public final String Company;
	public final int EMP_RATE_PER_HOUR;
	public final int NO_OF_WORKING_DAYS;
	public final int MAX_HRS_IN_MONTH;
	
	public CompanyEmpWage(String cmp, int ERPH, int NOWD, int MHIM)
	{
		this.Company = cmp;
		this.EMP_RATE_PER_HOUR = ERPH;
		this.NO_OF_WORKING_DAYS = NOWD;
		this.MAX_HRS_IN_MONTH = MHIM;
	}

}
