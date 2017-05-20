package com.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise6 {
	public void start() throws IOException{		
	}
	
	public void foo() throws NullPointerException{
		
	}
}
class TestException5 extends Exercise6{
	//If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or 
	//no exception but cannot declare parent exception.
	/*public void start() throws IOException{
	}*/
	/*public void start() throws FileNotFoundException{
	}*/
	/*public void start(){
	}*/
	/*public void start() throws Exception{
	}*/
	public void foo() throws RuntimeException{
		
	}
}
