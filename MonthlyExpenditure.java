package com.codegnan.Arrays;

import java.util.Scanner;

public class MonthlyExpenditure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Days");
		int days=sc.nextInt();
		int[] expenditure=new int[days];
		System.out.println("Enter expenditure on each day");
		for(int i=0;i<days;i++) {
			expenditure[i]=sc.nextInt();
		}
		int total=0;
		for(int i=0;i<days;i++) {
			total+=expenditure[i];
		}
		System.out.println("The Total Expenditure in Month is "+total);
		sc.close();
	}
}