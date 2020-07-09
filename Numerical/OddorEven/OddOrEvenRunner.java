//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 



import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class OddOrEvenRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("oddoreven.dat"));
		int size = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < size; i++)
		{
		   int num = file.nextInt();
		   OddOrEven test = new OddOrEven(num);
		   if(test.isOdd()== true)
		   {
		   	System.out.println(num + " is odd");
		   }
		   else
		   {
		   	System.out.println(num + " is even");
		   }
			//instantiate an OddOrEven
		}
	}
}