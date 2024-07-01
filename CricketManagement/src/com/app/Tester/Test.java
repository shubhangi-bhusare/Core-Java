package com.app.Tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import com.app.core.Cricketer;
import com.app.customException.CricketException;
import com.app.sorting.SortByRating;

public class Test {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			Map<String,Cricketer> map=new HashMap <>();
			while(!exit) {
				
				System.out.println("Menu- 1.Add cricketer 2.Display Cricketers 3.Modify Rating 4.Search Cricketer by name 5.Sort by primary key(i.e email) 6.Sort By Rating 0.exit");
				
				try {
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter the details of cricketer-  name,  age,  email,  phoneno,  rating");
						//String name, int age, String email, String phoneno, int rating
						String name=sc.next();
						int age=sc.nextInt();
						String email=sc.next();
						String phoneno=sc.next();
						int rating=sc.nextInt();
						Cricketer  cust= new Cricketer(name,age,email,phoneno,rating);
						map.put(email, cust);
						break;
					case 2:
						map.forEach((k,v)->System.out.println(v));
						break;
					case 3:
						System.out.println("Enter Cricketer email of which you want to modify rating");
						String email1=sc.next();
						System.out.println("Enter rating");
						int rating1=sc.nextInt();
						Cricketer em= map.get(email1);
						if(em!=null) {
							em.setRating(rating1);
						}
						else {
							throw new CricketException("Invalid email!!!...Cricketer is not exists");
						}
						
						break;
					case 4:
						System.out.println("Enter the name which you want to search");
						String name2=sc.next();
//						Cricketer cr=map.get(email2);						
//						for(Map.Entry<String, Cricketer> entry: map.entrySet()) 
//						{
//							Cricketer c=entry.getValue();
//							if(c.getName().equals(name2))
//							{
//								System.out.println(c);
//							}
//								else {
//								throw new CricketException("Name not found!!!");
//							}
//						}
						for(Map.Entry<String, Cricketer> entry: map.entrySet())
						{
							Cricketer c=entry.getValue();
							if(c.getEmail().equals(name2))
							{
								System.out.println(c);
							}
							else { 
								throw new CricketException("Name not found!!!");
							}
						}
						break;
					case 5:
						//when we convert map into Tree it sorts on the basis of primary key
						Map<String,Cricketer> tmap=new TreeMap<>(map);
						//convert the Map into list by using values() method so we can iterate over it using foreach loop
//						for(Cricketer c: tmap.values()) {
//							System.out.println(c);	
//						}
						tmap.forEach((k,v)->System.out.println(v));
						break;
					case 6:
						LinkedList<Cricketer> crlist=new LinkedList<>(map.values());
						Collections.sort(crlist, new SortByRating());
						System.out.println("sorted according to rating");
						for(Cricketer c: crlist)
						{
							System.out.println(c);
						}
						//crlist.forEach(i->System.out.println(i));
						break;
						
					case 0:
						exit=true;
						break;
					
					}
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
				
			}
		
	}
		
	}
}





