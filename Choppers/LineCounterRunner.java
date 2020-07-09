//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LineCounterRunner
{
	public static void main(String args[])
	{
		String s = "9 10 5 20 1 2 3";
		LineCounter test = new LineCounter(s);
		out.println(test);
		out.println("Count = " + test.getCount());
		
		s = "11 22 33 44 55 66 77 5 6 7";
		test = new LineCounter(s);
		out.println(test);
		out.println("Count = " + test.getCount());
		
		s = "48 52 29 100 50 293 4";
		test = new LineCounter(s);
		out.println(test);
		out.println("Count = " + test.getCount());
		
		s = "0";
		test = new LineCounter(s);
		out.println(test);
		out.println("Count = " + test.getCount());
		
		s = "100 90 95 98 100 97";
		test = new LineCounter(s);
		out.println(test);
		out.println("Count = " + test.getCount());
		
		
		
		
		
		
	}
}