package dad.threads;

/**
 * This program demonstrate multiple threads
 * @author emalianakasmuri
 *
 */
public class MultiThreadsApplication {

	public static void main(String[] args) {

		// Running a thread from a class that implements Runnable interface
		MyRunnable myRunnable1 = new MyRunnable();
		Thread runnableThread1 = new Thread(myRunnable1, "Runnable 1");
		runnableThread1.start();
		System.out.println(runnableThread1.getName());
		
		MyRunnable myRunnable2 = new MyRunnable();
		Thread runnableThread2 = new Thread(myRunnable2, "Runnable 2");
		runnableThread2.start();
		System.out.println(runnableThread2.getName());
		
		MyRunnable myRunnable3 = new MyRunnable();
		Thread runnableThread3 = new Thread(myRunnable3, "Runnable 3");
		runnableThread3.start();
		System.out.println(runnableThread3.getName());
		
		// Which thread is running
		Thread currentThread = Thread.currentThread();
		System.out.println("\n\nCurrent thread is = " + currentThread.getName());
		
		
	}

}
