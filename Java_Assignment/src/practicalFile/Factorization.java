package practicalFile;

import java.util.Scanner;

public class Factorization {
	public static void main(String[] args) { // Print the prime factors of N.
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long n = N;
		for (long i = 2; i <= n / i; i++) { // Test whether i is a factor.
			while (n % i == 0) { // Cast out and print i factors.
				n /= i;
				System.out.print(i + " ");
			} // Any factors of n are greater than i.
		}
		if (n > 1)
			System.out.print(n);
	}
}
/*
 * 100
 * 
 * i=2 2<=100/2 2<=50 100%2==0 n=100/2=50
 * 
 * i=3 3<=50/3
 * 
 * i=5 n=50/5=10
 * 
 * 
 * 2 5
 */