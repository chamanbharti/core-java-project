package staticKeyword;

//Program to get cube of a given number by static method  

class StaticMethod2{  
	static int cube(int x){  
		return x*x*x;  
	}  
	
	public static void main(String args[]){  
		//int result=StaticMethod2.cube(5);  
		int result=cube(5);
		System.out.println(result);  
	}  
}  
