//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFoodRunner
{
	public static void main(String[] args)
	{
		String s = "6 10 14 18 25 32";
		DogFood test = new DogFood(s);
		System.out.println(test);
		
		s = "12 15 20 26 35 42";
		test = new DogFood(s);
		System.out.println(test);
		
		s = "33 38 45 51 60 65";
		test = new DogFood(s);
		System.out.println(test);
		
		s = "40 50 60 77 90 101";
		test = new DogFood(s);
		System.out.println(test);
	}
}