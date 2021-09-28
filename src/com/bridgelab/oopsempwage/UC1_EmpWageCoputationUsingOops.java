package com.bridgelab.oopsempwage;

import java.util.Random;

class Employee{
	int present = 1;
	int absent = 0;
	int empWageperHr = 20;
	int empDayhr = 8;
	int partTimehr = 4;
	int dailyWage =0;
	int partTime = 2;
	Random ran = new Random();
	int fullDayWage =0;
	int partTimeWage = 0;


	// UC3_Check Employee is Present or Absent
	public void checkAbsentOrPresent() {
		for(int i= 0; i<=20; i++) {
			int check = ran.nextInt(2);
			if(check==present) {
				System.out.println("Day" + i + ": Employee is present");
			}
			else {
				System.out.println("Day" + i + ": Employee is absent");
			}
		}
	}
	// UC2_Calculate Daily Wage
	public void calculateDailyWage() {
		//			dailyWage = dailyWage + empWageperHr*empDayhr;
		for(int i= 0; i<=20; i++) {
			int check = ran.nextInt(2);
			if(check==present) {
				System.out.println("Day" + i + ": Employee is present and"
						+ " today's emplyee wage is: " + empWageperHr*empDayhr );
			}
			else {
				System.out.println("Day" + i + ": Employee is absent");
			}
		}
	}

	// UC_3 Add Part time employee & wage
	public void calculateDailyWage1() {
		//			dailyWage = dailyWage + empWageperHr*empDayhr;
		for(int i= 0; i<=20; i++) {
			int check = ran.nextInt(3);
			if(check==present) {
				System.out.println("Day" + i + ": Employee is present and "
						+ "today's emplyee wage is: " + empWageperHr*empDayhr );
			}
			else if (check == partTime) {
				System.out.println("Day" + i + ": Employee is part time doing  and"
						+ " today's emplyee wage is: " + empWageperHr*partTimehr );
			}
			else {
				System.out.println("Day" + i + ": Employee is absent");
			}
		}
	}

	// UC4_Using Switch Case Statement
	public void switchCase() {
		for(int i= 0; i<=20; i++) {
			int check = ran.nextInt(3);
			switch(check) {
			case 1:
				System.out.println("Day" + i + ": Employee is present and "
						+ "today's emplyee wage is: " + empWageperHr*empDayhr );
				
				break;
			
			case 2:
				System.out.println("Day" + i + ": Employee is part time doing  and"
						+ " today's emplyee wage is: " + empWageperHr*partTimehr );

				break;
			
			case 0:
				System.out.println("Day" + i + ": Employee is absent");
				break;
			}	
			
		}

	}
	
	// UC5_ Calculating Wage for a month
	public void calculateWageForMonth() {
		for(int i= 0; i<=20; i++) {
			int check = ran.nextInt(3);
			switch(check) {
			case 1:
				System.out.println("Day" + i + ": Employee is present and "
						+ "today's emplyee wage is: " + empWageperHr*empDayhr );
				fullDayWage += empWageperHr*empDayhr;
				break;
			
			case 2:
				System.out.println("Day" + i + ": Employee is part time doing  and"
						+ " today's emplyee wage is: " + empWageperHr*partTimehr );
				partTimeWage += empWageperHr*partTimehr;
				break;
			
			case 0:
				System.out.println("Day" + i + ": Employee is absent");
				break;
			}	
			
		}
		System.out.println("Employee wahe for a month = "+ (fullDayWage+partTimeWage));
	}
}




public class UC1_EmpWageCoputationUsingOops {
	public static void main(String[] args) {
		Employee emp = new Employee();
		//		emp.checkAbsentOrPresent();
//		emp.calculateDailyWage();
//		emp.switchCase();
		emp.calculateWageForMonth();


	}

}
