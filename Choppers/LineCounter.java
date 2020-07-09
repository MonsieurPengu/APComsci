//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

class LineCounter
{
	private String line;
	
	public LineCounter(String s)
	{
		line = s;
	}
	
	public int getCount()
	{
		int count = 0;
		Scanner chopper = new Scanner(line);
		
		while(chopper.hasNextInt())
		{
			chopper.nextInt();
			count++;
		}
		
		return count;
	}
	public String toString()
	{
		return line;
	}
  }
	
