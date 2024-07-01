package com.app.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.app.bank.BankStatement;

public interface IOUtils {
	static List<BankStatement>readDetails(String filename)throws IOException
	{
		List<BankStatement>lst=new ArrayList<>();
		DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String line;
		try(BufferedReader br=new BufferedReader(new FileReader(filename))) {
			br.readLine();
			while((line=br.readLine())!= null)
			{
				line.trim();
				if(!line.isEmpty())
				{
				String[]arr=line.split(",");
				if(arr.length==4)
				{
					LocalDate transactionDate=LocalDate.parse(arr[0].trim(),d);
					String narration=arr[1].trim();
					double withdrawalAmount=Double.parseDouble(arr[2].trim());
					double depositeAmount=Double.parseDouble(arr[3].trim());
					lst.add(new BankStatement(transactionDate,narration,withdrawalAmount,depositeAmount));
				}
				else
				{
					System.out.println("Incorrect Line to format");
				}
				}
			
			}
		
		}
	     catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
       return lst;
}
}
