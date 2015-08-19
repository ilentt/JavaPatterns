package ilentt.ilenlab.com.mvc;

public class Scores {
	private double st;
	private double nd;
	private double rd;
	
	public Scores() {
		this.st = 0;
		this.nd = 0;
		this.rd = 0;
	}
	
	public Scores(double st, double nd, double rd) {
		this.st = st;
		this.nd = nd;
		this.rd = rd;
	}
	
	public double getAverage() {
		return (st+nd+rd)/3;
	}
	
	public String toString() {
		return "First: " + st + " Second: " + nd + " Third: " + rd + " Average: " + getAverage();
	}
}
