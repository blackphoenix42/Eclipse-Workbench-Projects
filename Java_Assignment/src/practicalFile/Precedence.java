package practicalFile;

public class Precedence {
	public static void main(String[] args) {
		System.out.println(3 + 3 * 2);
		System.out.println(3 * 3 - 2);
		System.out.println(3 * 3 / 2);
		System.out.println("--");
		System.out.println(1 * 1 + 1 * 1);
		System.out.println(1 + 1 / 1 - 1);
		System.out.println(3 * 3 / 2 + 2);
		System.out.println("--");
		int x = 1;
		System.out.println(x++ + x++ * --x); 
		x = 1;
		System.out.println(x << 1 * 2 >> 1);
		x = 0xf;
		System.out.println(0xf & 0x5 | 0xa);
	}
}