package ilentt.ilenlab.com.singletonpattern;
	/*
	 * Implement Enum to avoid Reflection
	 */
public enum EnumSingleton {
	INSTANCE;
	
	public static void doSomething() {
		// do something
	}
	
	public String toString() {
		return getDeclaringClass().getCanonicalName() + "@" + hashCode();
	}
}
