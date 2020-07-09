//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
   private Double amount;

   public DogFood()
   {
   		amount = 0.0;		
   }

   public DogFood(String line)
   {
		Scanner chopper = new Scanner(line);
		double cups = 0;
		while(chopper.hasNextInt())
		{
			int x = chopper.nextInt();
			if(x>=2&&x<=4)
			{
				cups += 3.5;
			}	
			else if(x>=5&&x<=7)
			{
				cups += 7;
			}
			else if(x>=8&&x<=9)
			{
				cups += 10.5;
			}
			else if(x>=10&&x<=19)
			{
				cups += 14;
			}
			else if(x>=20&&x<=39)
			{
				cups += 24.5;
			}
			else if(x>=40&&x<=59)
			{
				cups += 31.5;
			}
			else if(x>=60&&x<=79)
			{
				cups += 42;
			}
			else if(x>=80)
			{
				cups += 52.5;
			}
		}
		
	amount = cups/60;
	amount = Math.ceil(amount);
	
   }

   public double getAmount()
   {
   	return amount;
   }

	public String toString()
	{

		return getAmount()+"\n" + Math.round(amount) + " - 10 Pound Bags";
	}
}