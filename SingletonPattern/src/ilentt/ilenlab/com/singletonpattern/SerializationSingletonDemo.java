package ilentt.ilenlab.com.singletonpattern;
	/*
	 * source: http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-with-examples
	 * 
	 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationSingletonDemo {
	
	public SerializationSingletonDemo() {
		// constructor
	}
	
	public void RunSerializationSingleton() {
		
		try {
			SerializationSingleton instance1 = SerializationSingleton.getInstance();
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.txt"));
			out.writeObject(instance1);
			out.close();
			
			// de-serialize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("filename.txt"));
			SerializationSingleton instance2 = (SerializationSingleton) in.readObject();
			in.close();
			
			System.out.println("instance1 hasdcode: "+instance1.hashCode());
			System.out.println("instance2 hasdcode: "+instance2.hashCode());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SerializationSingletonDemo s = new SerializationSingletonDemo();
		s.RunSerializationSingleton();
	}
}
