package com.thiss;
class ThisConstructor3
{  
    int id;  
    String name;  
    ThisConstructor3()
    {
    	System.out.println("default constructor is invoked");
    }  
      
    ThisConstructor3(int id,String name)
    {  
    	this ();//must be the first statement
	    this.id = id;  
	    this.name = name;  
	    //this ();//must be the first statement  
    }  
    void display(){System.out.println(id+" "+name);}  
      
    public static void main(String args[])
    {  
    	ThisConstructor3 e1 = new ThisConstructor3(111,"karan");  
    	ThisConstructor3 e2 = new ThisConstructor3(222,"Aryan");  
	    e1.display();  
	    e2.display();  
   }  
}  
