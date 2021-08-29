package dad.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HostRunnableApplication {
	
	private static final int MYTHREADS = 30;

	public static void main(String[] args) {
		
		// Define a list of host
		String[] hostList = { "https://www.instagram.com", "https://www.utem.edu.my", 
				"http://ftmk.utem.edu.my/web/", "https://www.bharian.com.my/", "https://www.bh123.com.my/", 
				"https://paypal.com", "http://bing.com/", "http://techcrunch.com/", 
				"http://mashable.com/", "http://thenextweb.com/", "http://wordpress.com/", 
				"http://wordpress.org/", "http://examplex.com/", "http://sjsu.edu/",
				"http://ebay.co.uk/", "http://google123.co.uk/", "http://wikipedia.org/", 
				"http://en.wikipedia.org" };
		System.out.println("Size of host:" + hostList.length);
		
		ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		for (int index = 0; index < hostList.length; index++) {
 
			String url = hostList[index];
			Runnable worker = new HostRunnable(url, index);
			executor.execute(worker);
		}
		executor.shutdown();
		
		// Wait until all threads are finish
		while (!executor.isTerminated()) {
 
		}
		
		System.out.println("\nFinished all threads");
		

	}

}
