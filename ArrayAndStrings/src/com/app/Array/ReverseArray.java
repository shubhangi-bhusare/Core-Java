package com.app.Array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		//int arr[]= {27,18,93,29,93};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=n-1;i>=0;i--)
		{
		   System.out.println(arr[i]);
		}
		
	}

}
