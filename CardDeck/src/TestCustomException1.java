import java.util.*;

class InvalidException extends Exception {
	InvalidException(String s) {
		super(s);
	}
}

class TestCustomException1 {
	static void validate(String str) throws InvalidException {
		if (str.equals("that I know Core Java Programming"))
			throw new InvalidException("I am very sure");
	}

	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			validate(str);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}
	}
}