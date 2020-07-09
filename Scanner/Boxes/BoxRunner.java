//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class BoxRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("box.dat"));
		Box test = new Box();
		int size = file.nextInt();
		file.nextLine();
		for(int x = 1; x <= size; x++)
		{
			String y = file.next();
			int si = file.nextInt();
			test = new Box(y,si);
			System.out.println(test);
			file.nextLine();
		}	
	}
}