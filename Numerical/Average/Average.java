//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
   private String line;

   public Average()
   {
   }

   public Average(String s)
   {
   		setLine(s);
   		System.out.println("average = "+getAverage());
   }

	public void setLine(String s)
	{
		line =s;
		System.out.println(line);
	}

	public int getCount()
	{
		int count=0;
		Scanner bob = new Scanner(line);
		while (bob.hasNextInt())
		{
			bob.nextInt();
			count+=1;
		}
		return count;
	}


	public int getSum()
	{
		int sum=0;
		Scanner bob = new Scanner(line);
		while (bob.hasNextInt())
		{
			sum+=bob.nextInt();
		}



		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = (double) getSum()/ getCount();

		return average;
	}

	public String getLine()
	{
		return "";
	}

	public String toString()
	{
		return "";
	}
}