package com.thiss;
class ThisConstructor2
{  
    int id;  
    String name;  
    String city;  
      
    ThisConstructor2(int id,String name)
    {  
	    this.id = id;  
	    this.name = name;  
    }  
    ThisConstructor2(int id,String name,String city)
    {  
	    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
    }  
    void display()
    {
    	System.out.println(id+" "+name+" "+city);
    }  
      
    public static void main(String args[])
    {  
    	ThisConstructor2 e1 = new ThisConstructor2(111,"karan");  
    	ThisConstructor2 e2 = new ThisConstructor2(222,"Aryan","delhi");  
    	e1.display();  
    	e2.display();  
   }  
}  
