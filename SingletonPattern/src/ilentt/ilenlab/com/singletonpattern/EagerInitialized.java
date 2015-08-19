package ilentt.ilenlab.com.singletonpattern;

	/*
	 * Eager initialized, this is easiest method to create a singleton class
	 * The instance of Singleton Class is created at the time of class loading
	 * This scenario has a drawback that instance is created
	 * even through client application might not is used it.
	 * 
	 * If your singleton class is not using a lot of resources, 
	 * this is the approach to use. But in most of the scenarios, 
	 * Singleton classes are created for resources such as File System,
	 * Database connections etc and we should avoid the instantiation 
	 * until unless client calls the getInstance method 
	 */

public class EagerInitialized {
	private static final EagerInitialized instance = new EagerInitialized();
	
	private EagerInitialized() {
		// constructor avoid client application to use constructor
	}
	
	public static EagerInitialized getInstance() {
		return instance;
	}
}
