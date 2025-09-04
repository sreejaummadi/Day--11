package com.codegnan.Arrays;

import java.util.Scanner;

public class SimpleArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] s= {"apple","kiwi","mango","banana"};
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		int[] arr= new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Print Array elemets");
		for(int n:arr) {
			System.out.println(n);
		}

	}

}
