package com.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

public class Exercise2 {
	public static void main(String[] args) {
	/*	try{
			testExceptions();
		}catch(FileNotFoundException | IOException e){
			e.printStackTrace();
		}
	
		// two way to solve above problem
		/*try{
			testExceptions();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}*/
		/*try{
			testExceptions();
		}catch(IOException e){
			e.printStackTrace();
		}*/
	/*private static void testExceptions() throws FileNotFoundException,IOException{
		
	}*/
	try {
		go();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch (IOException e) {
		e.printStackTrace();
	}catch (JAXBException e) {
		e.printStackTrace();
	}
}

public static void go() throws IOException, JAXBException, FileNotFoundException{

 }
}
