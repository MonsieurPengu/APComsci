//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreaker
{
   private String line;
   private int breaker;

   public LineBreaker()
   {
   	this("",0);
   }

   public LineBreaker(String s, int b)
   {
   	 line = s;
   	 breaker = b;
   }

	public void setLineBreaker(String s, int b)
	{
		line = s;
		breaker = b;
	}

	public String getLine()
	{
		return line;
	}

	public String getLineBreaker()
	{
		String box ="";

		Scanner chopper = new Scanner(line);
		for(int x = (line.length()/breaker); x >= 0; x--)
		{

	    	for(int i = breaker; i > 0; i--)
				{

					 if(chopper.hasNext())
					{
						System.out.print(chopper.next());
					}
					else
					{
						System.out.print("");
					}

				}

				System.out.println();


			}

			return box;
	}



	public String toString()
	{
		return line;
	}
}