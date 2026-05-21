package com.axsos.assignments.D5;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readCSV {
	
	
	
	public static Object[][] readData(String csvPath) throws IOException{
		
		//define our list we need to throw csv data into it
		List <Object[]> dataArr = new ArrayList <>();
		String rowData; //our pointer to read row
		String regex = "[,]"; //our case to spearate des, number, and expected
		
		try {
			
			Scanner inputStream = new Scanner(new File(csvPath)); //scanner for our file
			if (inputStream.hasNextLine())  // u have data after current row (first one is desc, number and expected)
			{
				inputStream.nextLine(); //make it next one (jump over the fisrt row in all csv file)
			}
			
			 while (inputStream.hasNext()) 
			 {
				 rowData = inputStream.nextLine(); //catch fisrt row
				 String [] rowLine = rowData.split(regex); //define array has row data, also split it when see "," in csv
				if (rowLine.length >= 3) { //well our array should have 3 items
	                   
						String description = rowLine[0].trim(); //fist one for description
	                    int number = Integer.parseInt(rowLine[1].trim()); // sec for numbrt to pe test
	                    boolean expected = Boolean.parseBoolean(rowLine[2].trim().toLowerCase()); // third for match expeted to actual result

	                    dataArr.add(new Object[]{description, number, expected}); //add our vlaues into arraylist 
	                }
			
			 }
			
			 inputStream.close();
		
		}
		
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		return dataArr.toArray(new Object[0][]);
		
		
	}

}
