package practicalFile;

import java.util.Scanner;

public class GamblerRuin {
	public static void main(String[] args) {
		// Run T experiments that start with $stake and terminate on $0 or $goal.
		Scanner sc = new Scanner(System.in);
		int stake = sc.nextInt();
		int goal = sc.nextInt();
		int T = sc.nextInt();
		int bets = 0;
		int wins = 0;
		for (int t = 0; t < T; t++) { // Run one experiment.
			int cash = stake;
			while (cash > 0 && cash < goal) { // Simulate one bet.
				bets++;
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			} // Cash is either 0 (ruin) or $goal (win).
			if (cash == goal)
				wins++;
		}
		System.out.println(100 * wins / T + "% wins");
		System.out.println("Avg # bets: " + bets / T);
	}
}