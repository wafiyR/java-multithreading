package dad.threads;

public class RunnableThread implements Runnable {
	
	private Thread thread;
	private String name;

	
	RunnableThread (String name) {
		this.name = name;
		System.out.println("Creating " +  name);
	}
	
	@Override
	public void run() {
		
		System.out.println("Running " +  name );
		
		try {
			
			// Print value in decreasing order
			for(int counter = 4; counter > 0; counter--) {
				
				System.out.println("From thread: " + name + ", value:" + counter);

				// Let the thread sleep for a 50 milliseconds so that other thread can be executed.
				// Blocking is applied here. 
				Thread.sleep(50);
			}
			
		} catch (InterruptedException e) {
			
			System.out.println("Thread " +  name + " interrupted.");
		}
		
		System.out.println("Thread " +  name + " exiting.");
		
	}
	
	/**
	 * Override start(). Give different implementation.
	 */
	public void start () {
		
		System.out.println("Starting " +  name );
		
		// Create thread if initially it was not created
		if (thread == null) {
			thread = new Thread (this, name);
			thread.start ();
		}
	}

}
