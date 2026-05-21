package com.axsos.assignments.D5;

public class primeNumberChecker {
	
	static boolean isPrime(int num)
    {
		// 1 or less
		if (num <= 1)
            return false;

        // Check divisibility
        for (int count = 2; count < num; count++) {
            if (num % count == 0)
                return false;
        }
        
        return true;
    }

}	

