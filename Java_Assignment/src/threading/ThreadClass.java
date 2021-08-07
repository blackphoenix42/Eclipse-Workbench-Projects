package threading;

class ThreadDemo extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++)
				System.out.println(Thread.currentThread().getName() + " in control");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

public class ThreadClass {
	public static void main(String[] args) {
		// Thread Class Instance Creation
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		
		// Yield Demo
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " in control");
		}

		// Priority Methods
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		ThreadDemo t3 = new ThreadDemo();
		System.out.println("t1 thread priority : " + t1.getPriority());
		System.out.println("t2 thread priority : " + t2.getPriority());
		System.out.println("t3 thread priority : " + t3.getPriority());
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);
		System.out.println("t1 thread priority : " + t1.getPriority());
		System.out.println("t2 thread priority : " + t2.getPriority());
		System.out.println("t3 thread priority : " + t3.getPriority());
	}
}