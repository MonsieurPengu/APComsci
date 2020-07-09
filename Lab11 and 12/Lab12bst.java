// Lab12bvst.java     This is the Student-Starting file.
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.



import java.util.ArrayList;

public class Lab12bst
{
	public static void main(String[] args)
	{
      Deck deck = new Deck();
      System.out.println(deck);
	}
}

class Card {
	private String suit;
	private String rank;
	private int value;

	public Card(String s, String r, int v) {
		suit = s;
		rank = r;
		value = v;
	}

	public String suit() {
		return suit;
	}

	public String rank() {
		return rank;
	}

	public int value() {
		return value;
	}

	public String toString() {
		return "[" + suit + ", " + rank + ", " + value + "]";
	}
}

class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] ranks = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten","Jack", "Queen", "King"};
	int[] values = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	private int size;
	private int count;

	public Deck()
	{
		size = 52;
		count = 0;
		for(int sIdx = 0; sIdx < 4; sIdx++)
		{
			for(int rIdx=0; rIdx < 13; rIdx++)
			{
				cards.add(new Card(suits[sIdx], ranks[rIdx], values[rIdx]));
				count ++;
			}
		}
		shuffle();
	}
	private void shuffle()
	{
		ArrayList<Card> temp = new ArrayList<Card>();
		for(int x = 0; x < size; x++)
			temp.add(null);
		for(int x =0; x < size; x++)
		{
			boolean use = true;
			while(use)
			{
				int rnd = (int) (Math.random() * size);
				if(temp.get(rnd) == null)
				{
					temp.set(rnd, cards.get(x));
					use = false;
				}
			}
		}
		for(int i = 0; i < size; i++)
		{
			cards.set(i, temp.get(i));
		}
	}
     /*private void shuffle()
     {
            Card temp;
            for(int x = 1; x<=1000; x++)
            {
                int ramd1 = (int)(Math.random() * size);
                int ramd2 = (int)(Math.random() * size);
                temp = cards.get(ramd1);
                cards.set(ramd1, cards.get(ramd2));
                cards.set(ramd1, temp);
            }
    }*/
    public String toString() {
        String str = "";
        for(int x = 0; x<=51; x++)
        {
            str += cards.get(x).toString()+"\n";
        }
        return str;
    }
}