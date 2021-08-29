package dad.threads;

/**
 * This class creates multiple threads to access critical section of a method.
 * @author emalianakasmuri
 *
 */
public class RunnableCounterApplication {

	public static void main(String[] args) {

		Counter counter = new Counter();
		
		RunnableCounter runnableCounter1 = new RunnableCounter(counter);
		Thread runnableThread1 = new Thread(runnableCounter1, "Runnable 1");
		runnableThread1.start();
		
		RunnableCounter runnableCounter2 = new RunnableCounter(counter);
		Thread runnableThread2 = new Thread(runnableCounter2, "Runnable 2");
		runnableThread2.start();
		
		System.out.println("\n\nProgram ends");
	}

}
