package dad.threads;

/**
 * This class running thread from various types of thread classes
 * @author emalianakasmuri
 *
 */
public class ThreadApplication {

	
	public static void main (String args[]) {
	
		// Running a thread from a class that subclassing Thread class
		MyThread myThread = new MyThread();
		myThread.start();
		
		// Running a thread from a class that implements Runnable interface
		MyRunnable myRunnable = new MyRunnable();
		Thread runnableThread = new Thread(myRunnable, "Runnable 1");
		runnableThread.start();
		System.out.println(runnableThread.getName());
		
		// Running a thread from Lambda
		Runnable myRunnableLambda = () -> { System.out.println("myRunnableLambda is running"); };
		Thread runnableLambdaThread = new Thread(myRunnableLambda);
		runnableLambdaThread.start();
		
		        
		
		
	}
}
