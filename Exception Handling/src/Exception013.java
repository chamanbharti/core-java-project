import java.io.*;  
class M2{ 
	
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
 
}  
public class Exception013{  
   public static void main(String args[]){  
	   
    try{  
     M2 m=new M2();  
     m.method();  
    }catch(Exception e){System.out.println("exception handled");}     
  
    System.out.println("normal flow...");  
  }  
}  