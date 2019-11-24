package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.

	/* HINT: You will most likely need to do this with recursion */
	public static void main(String[] args) {
		for (int i = 50; i > 0; i--) {
			int q = i;
			Thread t = new Thread(() -> {
				System.out.println("Hello from Thread " + q + "!");

			});
			t.start();
		}
	}
}
// for (int i = 0; i < 50; i++){
//			String threadNum = "Thread" + i;
//			Thread  = new Thread(()->{
//				System.out.println("Hello from Thread "+ i + "!");
//			});
//				
//			}
//		for (int i = 0; i < 50; i++) {
//			
//		}
