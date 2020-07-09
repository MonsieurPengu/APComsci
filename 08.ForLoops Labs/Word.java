//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{

	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word =s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String back="";
		for (int x =word.length()-1; x>=0;x-=1 )
			back+=word.charAt(x);
		return back;
	}

 	public void print()
 	{
 		out.println(getFirstChar());
 		out.println(getLastChar());
 		out.println(getBackWards());
 		out.println(word);
 		out.println();
	}
}