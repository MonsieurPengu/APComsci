//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Box
{
   private String let;
   private int size;
	
	public Box()
	{
		let = "";
		size = 0;
	}

	public Box(String l, int sz)
	{
		setStuff(l,sz);
	}
	
	public void setStuff(String l, int sz)
	{
		let = l;
		size = sz;
		
	}
	
	public String toString()
	{
		String output="";
		
		for(int x = 1; x <= size; x++)
		{
			for(int y = 1; y <= size; y++)
			{
				output += let;
			}
			output += "\n";
		}
		return output;
	}
}