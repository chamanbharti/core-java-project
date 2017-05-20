package model;

import java.io.InputStreamReader;
import java.util.Scanner;

public class LoanApproval {
	
	static LoanApproval loan = new LoanApproval();
	Scanner input = new Scanner(new InputStreamReader(System.in));
	String name,city;
	int age;
	String loanType;
	String occupationType;
	int LRA;
	int income;
	int LEA;
	int LAA;
	int lower;
	String passport;
	int PLA;
	String outstanding;
	

	private void CustomerDetails() {

		System.out.println("Enter name, city and age: ");
		name = input.nextLine();
		city = input.nextLine();
		age = input.nextInt();
		
		loan.validateAge();
	}
	
	private void validateAge() {

		if(age>=18 && age<=60){
			loan.selectLoanType();
		}
		else{
			System.out.println("Not Eligible ");
			loan.CustomerDetails();
		}
	}

	private void selectLoanType() {
		
		System.out.println("Enter Loan Type: (V for vehicle and H for House loan");
		loanType = input.nextLine();

		if(loanType.equalsIgnoreCase("V") | loanType.equalsIgnoreCase("H")){
			
			loan.selectOccupation();
		}
		else{
			loan.selectLoanType();
		}
	}

	private void selectOccupation() {

		System.out.println("Enter your occupation: (such as N, E, B)");
		occupationType = input.nextLine();
		if(occupationType.equalsIgnoreCase("N") | occupationType.equalsIgnoreCase("E") | occupationType.equalsIgnoreCase("B")){
			
			loan.enterLRL();
		}else{
			loan.selectOccupation();
		}
		
	}

	private void enterLRL() {

		System.out.println("Enter your loan request amount: ");
		LRA = input.nextInt();
		
		loan.enterIncome();
		
	}

	private int enterIncome() {
		System.out.println("Enter your annual income: ");
		income = input.nextInt();
		
		if(income<200000){
			
			System.out.println("Not eligible ");
			loan.enterIncome();
			
		}else if (income>=200000 && income<=500000) {
			
		  LEA = income * 50 /100;
		  loan.validateOccupation();
		  
		}else if (income>=500000 && income<=1000000) {
			
			 LEA = income * 80 /100;
			 loan.validateOccupation();
		}else{
			
			 LEA = income * 75 /100;
			 loan.validateOccupation();
		}
		return LEA;
	}

	private void validateOccupation() {

		if(occupationType.equalsIgnoreCase("B")){
			loan.calculateLoan();
		}
		else{
			loan.validateOutstanding();
		}
		
	}

	private void validateOutstanding() {

		if(outstanding.equalsIgnoreCase("Y") ){
			System.out.println("Enter PLA: ");
			PLA = input.nextInt();
			LEA = LEA - PLA;
			loan.havePassport();
		}else{
			loan.havePassport();
		}
	}

	private void havePassport() {

		if(passport.equalsIgnoreCase("Y")){
			loan.generateLAA();
		}else{
			System.out.println("Passport mandatory!");
			loan.havePassport();
		}
		
	}

	private void generateLAA() {
		 if(LAA<10000000){
			 System.out.println("Your loan is approved!");
			 System.out.println("Your have applied for: "+LRA);
			 System.out.println("Your can apply upto: "+LAA);
		 }
		 else{
			 loan.enterIncome();
		 }
		
	}

	private void calculateLoan() {

		if(occupationType.equalsIgnoreCase("B")){
			
			lower = LEA * 20 /100;
			LAA = LEA - lower;
		}else{
			
			LAA = LEA;
		}
		
	}

	public static void main(String[] args) {
		loan.CustomerDetails();
	}
}
