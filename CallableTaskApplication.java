package dad.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTaskApplication {

	public static void main(String[] args) {
		
		// Create a pool with 4 active threads
		ExecutorService executors = Executors.newFixedThreadPool(4);
		
		// Create 5 Futures - threads with return value
		Future<Integer>[] futures = new Future[5];
		
		// Instance of task - we call it worker
		Callable<Integer> worker = new CallableTask();
		
		try {
			
			// Create 5 workers and execute the task, keep return value in futures[]
			for (int counter = 0; counter < 5; counter++) {
				Future<Integer> future = executors.submit(worker);
				futures[counter] = future;

			}
			
			// Process return values form workers
			for (int counter = 0; counter < futures.length; counter++) {
				try {
				
					System.out.println("Result from Future " + counter + ":" + futures[counter].get());
				
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {

					e.printStackTrace();
				}
			}
			
		} finally {
			executors.shutdown();
		}

	}



}
