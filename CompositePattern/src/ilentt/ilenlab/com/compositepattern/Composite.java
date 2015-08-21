package ilentt.ilenlab.com.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {
	// collection the shape
	private List<Shape> shapes = new ArrayList<Shape>();
	
	public void Draw(String fillColor) {
		for(Shape shape : shapes)
			shape.Draw(fillColor);
	}
	
	// add shape to drawing
	public void addShape(Shape s) {
		this.shapes.add(s);
	}
	
	// remove shape from drawing
	public void removeShape(Shape s) {
		this.shapes.remove(s);
	}
	
	// clear all shape
	public void clearAllShape() {
		this.shapes.clear();
	}
}
