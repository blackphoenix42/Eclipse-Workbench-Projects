package testing;

public class MilkBottle {
	float quantity;

	MilkBottle() {

	}

	MilkBottle(String x) {

		String name = x;
		System.out.println("One " + name + "Bottle");
		System.out.println(quantity);
	}

	void uncap() {
		System.out.println("Bottle Opened");
		quantity = 100;
		System.out.println("Bottle" + quantity + "full");
	}

	float drinkFrom() {
		System.out.println("quarter bottle finished");
		if (quantity != 0)
			return quantity = (quantity * (1 / 4));
		else {
			System.out.println("full bottle finished");

			return 0;
		}
	}

	public static void main(String[] args) {
		MilkBottle b2 = new MilkBottle();
		MilkBottle b1 = new MilkBottle("flavoured milk");
		b1.uncap();
		float capacity = b1.quantity;
		System.out.println(capacity);
		b1.drinkFrom();
		

	}
}
