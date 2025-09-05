package com.codegnan.Arrays;

import java.util.*;

public class ReverseofArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of the Array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int left=0,right=arr.length-1,temp;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		while(left<right) {
			temp=arr[right];
			arr[right]=arr[left];
			arr[left]=temp;
			left++;
			right--;
		}
		System.out.println("Reversed Array"+Arrays.toString(arr));
		
	}
}
