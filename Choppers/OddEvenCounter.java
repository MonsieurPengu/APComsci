//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter
{
	private String line;

   public OddEvenCounter()
   {
   	line = "";
   }

   public OddEvenCounter(String s)
   {
   	setLine(s);
   }

	public void setLine(String s)
	{
		 line = s;
	}

	public int getEvenCount()
	{
		int count= 0;

		Scanner chop = new Scanner(line);
		while(chop.hasNextInt())
		{
			int x = chop.nextInt();
			if(x%2==0)
			{
				count++;
			}
		}
		return count;
	}

	public int getOddCount()
	{
		int count= 0;

		Scanner chop = new Scanner(line);
		while(chop.hasNextInt())
		{
			int y = chop.nextInt();
			if(y%2==1)
			{
				count++;
			}
		}
		return count;
	}

	public String toString( )
	{
		return line + "\n" + "Even Count = " + getEvenCount() + "\n" + "Odd Count = " + getOddCount() + "\n";
	}
}