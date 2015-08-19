package ilentt.ilenlab.com.singletonpattern;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {

	public ReflectionSingleton() {
		// constructor
	}
	
	@SuppressWarnings("rawtypes")
	public void ReflectionSingletonDemo() {
		EagerInitialized instance1 = EagerInitialized.getInstance();
		EagerInitialized instance2 = EagerInitialized.getInstance();
		
		System.out.println("Before reflection");
		System.out.println("Hashcode instance one: " + instance1.hashCode());
		System.out.println("Hashcode instance one: " + instance2.hashCode());
		
		try {
			Constructor[] constructor = EagerInitialized.class.getDeclaredConstructors();
			for(Constructor cons : constructor) {
				// below code will destroy the singleton pattern
				cons.setAccessible(true);
				instance2 = (EagerInitialized)cons.newInstance();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\nAfter reflection");
		System.out.println("Hashcode instance one: " + instance1.hashCode());
		System.out.println("Hashcode instance one: " + instance2.hashCode());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReflectionSingleton r = new ReflectionSingleton();
		r.ReflectionSingletonDemo();
	}

}
