package constructor;

public class CopyConstructor2 {
	
	 	int id;  
	    String name; 
	    
	    CopyConstructor2(int i,String n){  
		    id = i;  
		    name = n;  
	    }  
	      
	    CopyConstructor2(){  
		    
	    }  
	    
	    void display(){
	    		System.out.println(id+" "+name);
	    	}  
	   
	    public static void main(String args[]){  
	    	
	    	CopyConstructor2 s1 = new CopyConstructor2(111,"Karan");  
	    	CopyConstructor2 s2 = new CopyConstructor2(); 
	    	//copy constructor
	    	s2.id=s1.id;
	    	s2.name=s1.name;
	    	
		    s1.display();  
		    s2.display();  
		    //System.out.println(s2);
	   }  

}
