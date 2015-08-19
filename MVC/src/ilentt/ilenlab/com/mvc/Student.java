package ilentt.ilenlab.com.mvc;

public class Student {
	private String name;
	private String id;
	
	public Student() {
		this.name = "";
		this.id = "";
	}
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return "Name: " + name + " ID: " + id;
	}
}
