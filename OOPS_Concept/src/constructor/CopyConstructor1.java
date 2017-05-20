package constructor;

public class CopyConstructor1 {
	
	 	int id;  
	    String name; 
	    
	    CopyConstructor1(int i,String n){  
		    id = i;  
		    name = n;  
	    }  
	      
	    CopyConstructor1(CopyConstructor1 s){  //copy constructor
		    id = s.id;  
		    name =s.name;  
	    }  
	    
	    void display(){
	    		System.out.println(id+" "+name);
	    	}  
	   
	    public static void main(String args[]){  
	    	
	    	CopyConstructor1 s1 = new CopyConstructor1(111,"Karan");  
	    	CopyConstructor1 s2 = new CopyConstructor1(s1); //copy constructor
	    	
		    s1.display();  
		    s2.display();  
	   }  

}
