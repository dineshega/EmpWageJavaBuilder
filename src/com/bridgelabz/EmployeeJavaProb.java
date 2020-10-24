package com.bridgelabz;

public class EmployeeJavaProb {

	public static void main(String[] args) {
		int IS_FULLTIME = 1;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);

		if (empCheck == IS_FULLTIME) {
			System.out.println("Emplyoee is present");
		}
		else {
			System.out.println("Emplyoee is absent");
		}

	}

}
