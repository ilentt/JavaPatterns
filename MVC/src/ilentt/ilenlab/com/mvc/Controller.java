package ilentt.ilenlab.com.mvc;

public class Controller {
	private Model model;
	private View view;
	
	public Controller() {
		this.model = new Model();
		this.view = new View();
	}
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public Student getStudent() {
		return this.model.getStudent();
	}
	
	public void setStudent(Student stu) {
		this.model.setStudent(stu);
	}
	
	public Subject getSubject() {
		return this.model.getSubject();
	}
	
	public void setSubjecet(Subject sub) {
		this.model.setSubject(sub);
	}
	
	public Scores getScores() {
		return this.model.getScores();
	}
	
	public void setScores(Scores sco) {
		this.model.setScores(sco);
	}
	
	public void updateView() {
		this.view.ShowView(model);
	}
}
