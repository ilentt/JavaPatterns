package ilentt.ilenlab.com.mvc;

public class Model {
	private Student student;
	private Subject subject;
	private Scores scores;
	
	public Model() {
		this.student = new Student();
		this.subject = new Subject();
		this.scores = new Scores();
	}
	
	public Model(Student stu, Subject sub, Scores sco) {
		this.student = stu;
		this.subject = sub;
		this.scores = sco;
	}
	
	public Student getStudent() {
		return this.student;
	}
	
	public void setStudent(Student stu) {
		this.student = stu;
	}
	
	public Subject getSubject() {
		return this.subject;
	}
	
	public void setSubject(Subject sub) {
		this.subject = sub;
	}
	
	public Scores getScores() {
		return this.scores;
	}
	
	public void setScores(Scores sco) {
		this.scores = sco;
	}
	
	public String toString() {
		return "Student: \n" + student.toString() + 
				"\nSubject: \n" + this.subject.toString()+
				"\nScores: \n" +this.scores.toString();
	}
}
