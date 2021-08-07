package practicalFile;

import java.util.*;

public class binaryOctalHexa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);;
		String num1, num2, num3, num4, sum_Hex, sum_oct;
		int FDec, SDec, sum;
		System.out.println("Enter your first Number:");
		FDec = input.nextInt();
		System.out.println("Enter your second Number:");
		SDec = input.nextInt();
		num1 = Integer.toHexString(FDec);
		num2 = Integer.toHexString(SDec);
		System.out.println("The hexadecimal representation of numbers is\n" + num1 + "\n" + num2);
		num3 = Integer.toOctalString(FDec);
		num4 = Integer.toOctalString(SDec);
		System.out.println("\nThe octal representation of numbers is\n" + num3 + "\n" + num4);
		sum = FDec + SDec;
		sum_Hex = Integer.toHexString(sum);
		sum_oct = Integer.toOctalString(sum);
		System.out.println("The Hexadecimal sum is " + "\n" + sum_Hex);
		System.out.println("The octal sum is " + "\n" + sum_oct);
	}
}