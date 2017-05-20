package com.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise7 {
	public static void main(String[] args) {
		
		try {
			foo();
		} catch (IOException e) {
			//e = new Exception("");
			e.printStackTrace();
		}catch(Exception e){
			e = new Exception("");
			e.printStackTrace();
		}
	}

	public static void foo() throws IOException{
		
	}
}
