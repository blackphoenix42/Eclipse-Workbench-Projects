package threading;

class Multithreading implements Runnable {
	public void run() {
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(Thread.currentThread().getName() + "  " + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

class RunnableInterface {
	public static void main(String[] args) {
		// Runnable Interface Instance Creation
		Thread obj = new Thread(new Multithreading());

		// Sleep Demo
		obj.start();

		Thread obj2 = new Thread(new Multithreading());
		obj2.start();
	}
}
