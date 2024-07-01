package com.app.Array;

public class Duplicate {
	public static void main(String[] args)
	{
		int arr[]= {2,3,4,2,5,3,9,8,8,8,7,6,6};
		for(int i=0;i<arr.length;i++)
		{
			int count =1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=0;
				}
			}
			if(count>1&&arr[i]!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		//System.out.println(dup);
	}

}
