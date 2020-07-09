
import java.util.ArrayList;
public class Lab11bst {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.display();
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
		private Card[] cards;
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten","Jack", "Queen", "King"};
		int[] values = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		private int size;

		public Deck()
		{
			size = 52;
			cards = new Card[size];
			int count = 0;
			for(int sIdx = 0; sIdx < 4; sIdx++)
			{
				for(int rIdx=0; rIdx < 13; rIdx++)
				{
					cards[count] = new Card(suits[sIdx], ranks[rIdx], values[rIdx]);
					count ++;
				}

			}
			shuffle();
		}

		private void shuffle()
		{
			for(int k=1; k < 1000; k++)
			{
				int rnd1 = (int) (Math.random()*52);
				int rnd2 = (int) (Math.random()*52);
				Card temp = cards[rnd1];
				cards[rnd1] = cards[rnd2];
				cards[rnd2] = temp;
			}
   	    }
        public void display() {
        	String str = "";
      		for (int k = 0; k < size; k++)
         		str += cards[k].toString() + "\n";
      		System.out.println(str);
   	    }
	}