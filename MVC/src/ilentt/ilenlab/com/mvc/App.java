package ilentt.ilenlab.com.mvc;

public class App {
	
	private Student student;
	private Subject subject;
	private Scores scores;
	
	private Model model;
	private View view;
	private Controller controller;
	
	public App() {
		// constructor
		this.student = new Student();
		this.subject = new Subject();
		this.scores = new Scores();
		
		this.model = new Model();
		this.view = new View();
		this.controller = new Controller();
	}
	
	public void runApp() {
		student = new Student("Tran Thanh I Len" , "STU0001");
		subject = new Subject("TOEIC",4);
		scores = new Scores(500, 550, 650);
		
		model = new Model(student,subject,scores);
		controller = new Controller(model, view);
		
		// initial display
		controller.updateView();
		System.out.println("\n===========\n");
		System.out.println("Controller receive some interaction effect the objects\n");
		controller.setStudent(new Student("ILenTT", "STU0002"));
		controller.setSubjecet(new Subject("IELTS", 5));
		controller.setScores(new Scores(6,6.5,7.5));
		
		// re-display
		controller.updateView();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();
		app.runApp();
	}

}
