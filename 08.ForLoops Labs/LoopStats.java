//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop,total,even,odd;

	public LoopStats()
	{
	}

	public LoopStats(int beg, int end)
	{
		setNums(beg,end);
	}

	public void setNums(int beg, int end)
	{
		start = beg;
		stop = end;

	}


	public void print()
	{
		total = 0;
		even = 0;
		odd = 0;

		for(int star = start; star<=stop; star+=1)
		{

			total+=star;
			if (star%2==0)
			{
				even+=1;
			}

			else
			{
				odd+=1;
			}


		}
		out.println("total "+total);
		out.println("even "+ even);
		out.println("odd "+odd);
		out.println();
	}
}