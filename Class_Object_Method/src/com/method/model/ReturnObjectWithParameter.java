package com.method.model;
class Test{
	int x,y;
	public Test(int x,int y){
		this.x=x;
		this.y=y;
	}
	public boolean ObjectCheck(Test test){
		if(test.x == x && test.y == y)
			return true;
		else
			return false;
	}
	
}
public class ReturnObjectWithParameter {
	
	
	public static void main(String[] args) {
		Test t1 = new Test(12,15);
		Test t2 = new Test(12,15);
		Test t3 = new Test(12,20);
		System.out.println("t1 == t2 :"+t1.ObjectCheck(t2));
		System.out.println("t1 == t3 :"+t1.ObjectCheck(t3));

}
}
