package ilentt.ilenlab.com.compositepattern;

public class App {
	
	Shape circle;
	Shape triangle;
	
	public App () {
		this.circle = new Circle();
		this.triangle = new Triangle();
	}
	
	public void runApp() {
		Composite c = new Composite();
		c.addShape(circle);
		c.addShape(triangle);
		
		c.Draw("red");
		
		c.removeShape(triangle);
		c.Draw("blue");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App a = new App();
		a.runApp();
	}

}
