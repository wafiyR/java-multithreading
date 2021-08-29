package dad.threads;

public class RunnableThreadApplication {
	
	public static void main (String args[]) {
		
		
		// Running a thread from a class that implements Runnable interface
		RunnableThread runnableThread1 = new RunnableThread("Runnable 1");
		Thread thread1 = new Thread(runnableThread1);
		thread1.start();

		RunnableThread runnableThread2 = new RunnableThread("Runnable 2");
		Thread thread2 = new Thread(runnableThread2);
		thread2.start();

		RunnableThread runnableThread3 = new RunnableThread("Runnable 3");
		Thread thread3 = new Thread(runnableThread3);
		thread3.start();
	}

}
