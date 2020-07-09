// Lab12avst.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.


import java.util.Scanner;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class Lab12avst
{
	public static void main(String[] args)
	{
		MagpieLab12a maggie = new MagpieLab12a();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}


class MagpieLab12a
{
	String[] responses = {"Interesting, tell me more.", "Hmm.", "Do you really think so?", "You don't say.", "Isn't the weather nice today?", "Are you sure about that?", "Certainly.", "What else?", "How nice of you.", "Are you ugly?"};
	ArrayList<String> fr = new ArrayList<String>(asList("Tell me more about your family.", "Your dad sure seems like a nice guy", "I love your family.", "How old is your father?", "How many people are there in your family?", "Why is your dad so old?", "I have a family too you know.", "My mom was a computer.", "I have 16 billion family members.", "Don't you miss your monkey ancestors?"));
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
		statement = statement.toLowerCase();
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0
				|| statement.indexOf("parent") >= 0
				|| statement.indexOf("family") >= 0)
		{
			response = fr.get((int)(Math.random() * fr.size()));
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	private String getRandomResponse()
	{
		return responses[(int)(Math.random() * responses.length)];
	}
}