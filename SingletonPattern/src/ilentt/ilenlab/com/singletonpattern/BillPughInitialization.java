package ilentt.ilenlab.com.singletonpattern;

public class BillPughInitialization {
	
	/*
	 * the private inner static class that contains the instance of the singleton class. 
	 * When the singleton class is loaded, SingletonHelper class is not loaded into memory 
	 * and only when someone calls the getInstance method, 
	 * this class gets loaded and creates the Singleton class instance.
	 */
	
	private BillPughInitialization() {
		// constructor avoid client application to use constructor
	}
	
	private static class Helper {
		private static final BillPughInitialization instance = new BillPughInitialization(); 
	}
	
	public static BillPughInitialization getInstance() {
		return Helper.instance;
	}
}
