package ilentt.ilenlab.com.singletonpattern;
 
 /*
  * Lazy initialization method to implement Singleton pattern 
  * creates the instance in the global access method.
  * The lazy implementation works fine incase of single threaded environment 
  * but when it comes to multithreaded systems, 
  * it can cause issues if multiple threads are inside 
  * the if loop at the same time. It will destroy the singleton pattern 
  * and both threads will get the different instances of singleton class.
  */
public class LazyInitialization {
	private static LazyInitialization instance;
	private LazyInitialization() {
		// constructor avoid client application to use constructor
	}
	
	public static LazyInitialization getInstance() {
		if(instance==null)
			instance = new LazyInitialization();
		return instance;
	}
}
