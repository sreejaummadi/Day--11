package com.codegnan.Arrays;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=sc.nextInt();
		int sum=0;
		double average;
		int arr[]=new int[size];
		System.out.println("Enter array Elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		average=sum/size;
		System.out.println("Average of given Array elements : " +average);
		sc.close();
	}

}
