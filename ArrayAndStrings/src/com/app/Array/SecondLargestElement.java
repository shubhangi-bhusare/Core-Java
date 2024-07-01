package com.app.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SecondLargestElement {
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
//		System.out.println("Enter size of array");
		//int n=sc.nextInt();
//		int arr[]=new int[n];
//		System.out.println("Enter elements");
		
		
		
		
		int arr[]= {24,9,98,3,89,56,75,23};
		Arrays.sort(arr);
		System.out.println("Second Largest element in Array is: "+arr[arr.length-2]);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		int seclarge=Arrays.stream(arr).boxed().sorted((a,b)->b-a).distinct().skip(1).findFirst().orElseThrow();
		System.out.println(seclarge);
		//Largest num print
//		int max=0;
//		for(int i=0;i<n;i++)
//		{
//			if(arr[i]>arr[max])
//			{
//				max=i;
//			}
//			
//		}
//		System.out.println(arr[max]);
//		
		
		
	}

}
