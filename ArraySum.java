package com.codegnan.Arrays;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size=sc.nextInt();
		int sum=0;
		int[] arr=new int[size];
		System.out.println("Enter Array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("The sum of Array elements is" +sum);
		sc.close();
	}
}