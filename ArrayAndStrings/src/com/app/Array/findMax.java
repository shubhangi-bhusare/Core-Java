package com.app.Array;

import java.util.ArrayList;
import java.util.List;

public class findMax {

	 public static int hurdleRace(int k, List<Integer> height) {
		    // Write your code here
		    int[] he=height.stream().mapToInt(Integer::intValue).toArray();
		     int dose=0;
		     int max=he[0];
		     for(int i=0;i<he.length;i++)
		     {
		    	 if(he[i]>max) {
		    		 max=he[i];
		    	 }
		     }
		     System.out.println("Max index is:"+max);
		     
	         if(max>k){
	             dose=max-k;
	         }else{
	             dose=0;
	         }
		     
		     return dose;
		    

		    }

	public static void main(String[] args) {
		List<Integer>li=new ArrayList<Integer>();
		li.add(10);
		li.add(6);
		li.add(3);
		li.add(5);
		li.add(2);
		li.add(9);
		System.out.println(hurdleRace(4, li));

	}

}
