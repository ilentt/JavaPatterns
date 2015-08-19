package ilentt.ilenlab.com.mvc;

public class Subject {
	private String title;
	private int credits;
	
	public Subject() {
		this.title  = "";
		this.credits = 0;
	}
	
	public Subject(String title, int credits) {
		this.title = title;
		this.credits = credits;
	}
	
	public String toString() {
		return "Title: " + title + " Credits: " + credits;
	}
}
