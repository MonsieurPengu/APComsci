// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class OddOrEven
{
	private int number;

	public OddOrEven()
	{
		number = 0;
	}

	public OddOrEven(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}

	public boolean isOdd( )
	{
		if(number%2==1)
		{
			return true;
		}
		else
		{
		return false;
	    }
	}
	public String toString()
	{



		return number+" is even.\n\n";
	}
}