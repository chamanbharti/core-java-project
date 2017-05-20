
public class ArrayIndexOutOfBoundsException{ 
 
 public static void main(String args[]){  

	int x[] = {100,101,102};
	x[3]=90;
   for(int i=0;i < x.length;i++){   
     System.out.println(x[i]);
 } 
   }  

} 
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Simple.main(Simple.java:7)*/ 