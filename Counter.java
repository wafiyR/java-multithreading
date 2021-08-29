package dad.threads;

/**
 * This class demonstrate the implementation of critical section
 * @author emalianakasmuri
 *
 */
public class Counter {
	
	protected long totalValue = 0;

	/**
	 * This method updates the totalValue.  
	 * The body of implementation is the critical section.
	 * @param value
	 */
    public void add(long value){
        this.totalValue += value;
    }

	public long getTotalValue() {
		return totalValue;
	}
    
    

}
