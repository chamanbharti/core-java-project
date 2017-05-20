package staticKeyword;

//Program of changing the common property of all objects(static field).  

class StaticMethod1{  
	   int rollno;  
	   String name;  
	   static String college = "ITS";  
	   //String college = "ITS";
	     
	   static void change(){  
	   college = "BBDIT";  
	   }  
	
	   StaticMethod1(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	
	  public static void main(String args[]){  
		 // StaticMethod1.change(); 
		  change();
	
		  StaticMethod1 s1 = new StaticMethod1 (111,"Karan");  
		  StaticMethod1 s2 = new StaticMethod1 (222,"Aryan");  
		  StaticMethod1 s3 = new StaticMethod1 (333,"Sonoo");  
	
		  s1.display();  
		  s2.display();  
		  s3.display();  
	  }  
}  