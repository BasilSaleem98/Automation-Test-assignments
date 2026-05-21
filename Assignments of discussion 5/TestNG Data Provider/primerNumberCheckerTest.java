package com.axsos.assignments.D5;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;


public class primerNumberCheckerTest {
	
	private String csvPath = "E:\\eclipse\\eclipse workspace\\QABootcamp\\src\\com\\axsos\\assignments\\D5\\resources\\data.csv";
	
	//calling readCSV to return csv data to data provider
	@DataProvider(name="dataInput")
	public Object[][] primeTest() throws IOException {
		
		//this path points to csv location
        return readCSV.readData(csvPath);
	}
	
	//make our main test to deal with DP data, desc, number we gonna test, and boolean value as expected val
	@Test(dataProvider = "dataInput")
    public void testIsPrime(String description, int number, boolean expectedResult) {
		
        boolean actualResult = primeNumberChecker.isPrime(number); //determine the actual
        
        Assert.assertEquals(expectedResult, actualResult); //check if expected match our actual
    }

}
