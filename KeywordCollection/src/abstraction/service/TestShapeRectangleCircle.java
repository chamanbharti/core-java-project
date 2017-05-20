package abstraction.service;

import abstraction.model.Circle;
import abstraction.model.Rectangle;
import abstraction.model.Shape;

//In real scenario, method is called by programmer or user  
public class TestShapeRectangleCircle {
	public static void main(String args[]){  
		Shape s=new Circle();//In real scenario, object is provided through method e.g. getShape() method  
		s.draw(); 
		Shape s2=new Rectangle();//In real scenario, object is provided through method e.g. getShape() method  
		s2.draw(); 
		}  

}
