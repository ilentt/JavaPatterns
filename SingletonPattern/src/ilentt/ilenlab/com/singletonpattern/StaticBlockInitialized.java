package ilentt.ilenlab.com.singletonpattern;
	
	/*
	 * Static block initialization creates the instance 
	 * even before it’s being used and that is not the best practice to use
	 */

public class StaticBlockInitialized {
	private static StaticBlockInitialized instance;
	
	private StaticBlockInitialized() {
		// constructor avoid client application to use constructor
	}
	
	static {
		try {
			instance = new StaticBlockInitialized();
		}catch(Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static StaticBlockInitialized getInstance() {
		return instance;
	}
}
