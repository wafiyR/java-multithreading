package dad.threads;

/**
 * This class demonstrate a thread accessing critical section.
 * @author emalianakasmuri
 *
 */
public class RunnableCounter implements Runnable {

	private Counter counter;
	
	public RunnableCounter(Counter counter) {
		
		this.counter = counter;
	}
	
	
	@Override
	public void run() {
		
		// In each loop, thread is accessing critical section
		for (int index = 0; index < 5; index++) {
			
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() + ": Adding " + index);
				counter.add(index);
			}
		}
		
		// Print the total value for each thread
		System.out.println("The value of counter from " + Thread.currentThread().getName() 
				+" is " + counter.getTotalValue());
		
	}
	
	
	

}
