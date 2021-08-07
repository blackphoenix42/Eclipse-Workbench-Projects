package practicalFile;

public class ShuffleDeck {
	public static void main(String... s) {
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] deck = new String[suit.length * rank.length];
		for (int i = 0; i < suit.length; i++)
			for (int j = 0; j < rank.length; j++)
				deck[(rank.length * i) + j] = rank[j]+" of "+ suit[i];;
		int n = deck.length;
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String t = deck[i];
			deck[i] = deck[r];
			deck[r] = t;
			System.out.println(deck[i]);
		}
		
	}
}