/*
 Q: Write a java program for using 3 dimensional array eg.  to print and shuffle once and print again,  
 a deck of 52 playing cards with all choices like
  &  red cards  of heart and diamond, black  cards of  clubs and spades, 
  with each set having 13 cards of Ace,King,Queen,Jack,Ten,Nine, Eight,  Seven,Six,Five, Four, Three,Two
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CardDeck {

	public static void main(String[] args) {

		String[][][] deck = {
				{
					{"red","diamond","heart"}
				},
				{
					{"black","clubs","spades"}
				},
				{
					{"Ace","King","Queen","Jack","Ten","Nine", "Eight",  "Seven","Six","Five", "Four", "Three","Two"}
				}
			};
		String[] cards= new String[52];
		int m=0;
		for(int i=0;i<2;i++) {
				String str = deck[i][0][0];
				for(int k=1;k<3;k++) {
					for(int j=0;j<13;j++) {
						cards[m++] = str+" "+deck[i][0][k]+" "+deck[2][0][j];
					}
				}
		}
		for(String str : cards) {
			System.out.println(str);
		}
		List<String> shuffledCards = Arrays.asList(cards);
		Collections.shuffle(shuffledCards);
		System.out.println(shuffledCards);
	}

}
