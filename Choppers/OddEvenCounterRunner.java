//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounterRunner
{
   public static void main(String args[])
   {
   	String s = "9 10 5 20";
   	OddEvenCounter test = new OddEvenCounter(s);
   	out.println(test);

   	s = "11 22 33 44 55 66 77";
   	test = new OddEvenCounter(s);
   	out.println(test);

   	s = "3 5 3 1 5 7 5 4 3 2 7 8 9 9 9 6";
   	test = new OddEvenCounter(s);
   	out.println(test);

   	s = "2 4 6 8 2 4 6";
 	test = new OddEvenCounter(s);
   	out.println(test);
	}
}