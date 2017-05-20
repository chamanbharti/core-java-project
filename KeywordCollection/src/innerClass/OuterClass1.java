package innerClass;

	class OuterClass1{  
		 private int data=30;  
		 
		 class Inner{  
		  void msg(){System.out.println("data is "+data);}  
		 } 
		 
		 public static void main(String args[]){  
			 OuterClass1 obj=new OuterClass1();  
			 OuterClass1.Inner in=obj.new Inner();  
		  in.msg();  
		 }  
	}  