package my.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
/*
 * Write the code to shuffle a deck of 52 cards,
 * and shuffle them equally to 4 players
 */
class Card {
  public enum Rank {
		DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}
	public enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES
	}
	private final Rank rank;
	private final Suit suit;
	private Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	public Rank rank() {
		return rank;
	}
	public Suit suit() {
		return suit;
	}
	public String toString() {
		return rank + " of " + suit;
	}
	private static final List<Card> protoDeck = new ArrayList<Card>();
	// Initialize prototype deck
	static {
		for (Suit suit : Suit.values())
			for (Rank rank : Rank.values())
				protoDeck.add(new Card(rank, suit));
	}
	public static ArrayList<Card> newDeck() {
		return new ArrayList<Card>(protoDeck); // Return copy of prototype deck
	}
}
public class DeckOfCardsTest {
	private Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
	public DeckOfCardsTest() {
	}
	public static void main(String[] args) {
		UsingDeck();
		UsingNumbers();
	}
	
	public static void UsingDeck(){
	ArrayList<Card> player1 = new ArrayList<Card>();
	ArrayList<Card> player2 = new ArrayList<Card>();
	ArrayList<Card> player3 = new ArrayList<Card>();
	ArrayList<Card> player4 = new ArrayList<Card>();

	ArrayList<Card> deck = Card.newDeck();
	Random random = new Random();
	int j = 1;
	for (int i = 0; i < 52; i++) {
		int temp = random.nextInt(52);
		if (j == 1) {
			player1.add(deck.get(i));
			j++;
			continue;
		} else if (j == 2) {
			player2.add(deck.get(i));
			j++;
			continue;
		} else if (j == 3) {
			player3.add(deck.get(i));

			j++;
			continue;
		} else if (j == 4) {
			player4.add(deck.get(i));
			j = 1;
			continue;
		}
	}
	System.out.println(" Player 1 " + player1);
	System.out.println(" Player 2 " + player2);
	System.out.println(" Player 3 " + player3);
	System.out.println(" Player 4 " + player4);
}
	
	public static void UsingNumbers(){
		Random random = new Random();
		int [] player1 = new int[13];
		int [] player2 = new int[13];
		int [] player3 = new int[13];
		int [] player4 = new int[13];
		
		int[] DeckOfCards= new int[52];
		
		for(int i = 0; i < 52 ; i ++){
		int temp = random.nextInt(52);
		DeckOfCards[i] = temp;
		//System.out.println(" DeckOfCards [" + i + "]: " + DeckOfCards[i] );
		}
		printArray("DeckOfCards", DeckOfCards, 52);
		
		for(int j = 0, k = 0; j < 52 ; k ++){
			player1[k]= DeckOfCards[j]; j++;
			player2[k]= DeckOfCards[j]; j++;
			player3[k]= DeckOfCards[j]; j++;
			player4[k]= DeckOfCards[j]; j++;
		}
		
		printArray("player1", player1, 13);
		printArray("player2", player2, 13);
		printArray("player3", player3, 13);
		printArray("player4", player4, 13);
	}
	
	public static void printArray(String name, int arr[], int len){
		System.out.print(name + ":");
		for(int  k = 0; k < len ; k ++){
			System.out.print("  " + arr[k] );
		}
		System.out.println();
	}

}
