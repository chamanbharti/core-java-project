package CallbyValueCallbyReference;

public class CallbyValue2 {
	int data=50;  
	  
	 void change(CallbyValue2 op){  
	 op.data=op.data+100;//changes will be in the local variable only  
	 }  
	 
	 public static void main(String[] args) {
		 CallbyValue2 op=new CallbyValue2();  
		  
		   System.out.println("before change "+op.data);  
		   op.change(op);  
		   System.out.println("after change "+op.data);  
	}

}
