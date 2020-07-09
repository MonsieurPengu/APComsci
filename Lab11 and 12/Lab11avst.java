// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Lab11avst
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the primes upper bound  ===>>  ");
		final int MAX = input.nextInt();
		boolean primes[] = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);
		input.close();
	}

	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
    	Arrays.fill(primes,true);
    	primes[0]=primes[1]=false;
    	for (int i=2;i<primes.length;i++) {
        	if(primes[i]) {
            	for (int j=2;i*j<primes.length;j++) {
                	primes[i*j]=false;
            	}
        	}
    	}
	}

	public static void displayPrimes(boolean primes[])
	{
		String pattern = "0000";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		for(int idx = 1; idx < primes.length; idx++)
		{
			if(primes[idx] == true)
			{
				System.out.print(decimalFormat.format(idx) + " ");
			}
		}

	}

}



