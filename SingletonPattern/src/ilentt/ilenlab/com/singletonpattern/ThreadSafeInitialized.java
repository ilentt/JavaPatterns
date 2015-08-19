package ilentt.ilenlab.com.singletonpattern;

public class ThreadSafeInitialized {
	private static ThreadSafeInitialized instance;
	private ThreadSafeInitialized() {
		// constructor avoid client application to use constructor
	}
	
	/*
	 * Thread Safe implementation works fine and provides thread-safety 
	 * but it reduces the performance because of cost associated 
	 * with the synchronized method
	 */
	public static synchronized ThreadSafeInitialized getInstance() {
		if(instance == null)
			instance =  new ThreadSafeInitialized();
		return instance;
	}
	
	/*
	 * To avoid this extra overhead every time, 
	 * double checked locking principle is used. 
	 * In this approach, the synchronized block is used inside 
	 * the if condition with an additional check to ensure that 
	 * only one instance of singleton class is created.
	 */
	public static synchronized ThreadSafeInitialized getInstanceUsingDoubleLocking() {
		if(instance == null) {
			synchronized(ThreadSafeInitialized.class) {
				if(instance == null)
					instance = new ThreadSafeInitialized();
			}
		}
		return instance;
	}
}
