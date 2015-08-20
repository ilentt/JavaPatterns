package ilentt.ilenlab.com.singletonpattern;

import java.io.Serializable;

public class SerializationSingleton implements Serializable{
	private static final long serialVersionUID = -7604766932017737115L;
	private SerializationSingleton(){
		// constructor avoid client application to use constructor
	}
	
	private static class Helper {
		private static final SerializationSingleton instance = new SerializationSingleton();
	}
	
	public static SerializationSingleton getInstance() {
		return Helper.instance;
	}
	
	// avoid reflection
	protected Object readResolve() {
	    return getInstance();
	}
}
