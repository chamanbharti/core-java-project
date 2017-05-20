package Has_Relationship;

public class Circle {
	Operation op;//aggregation
	double pi=3.14;
	
	double area(int radius){
		//Operation op=new Operation();
		 op=new Operation();
		int rsquare=op.square(radius);//code reusability(i.e.delegates the method call).
		return pi*rsquare;
	}
	
	
}
