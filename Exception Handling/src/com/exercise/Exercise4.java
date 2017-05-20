package com.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

public class Exercise4 {
	public static void main(String[] args) {

	try {
			go();
	}catch (IOException e) {
		e.printStackTrace();
	}catch (JAXBException e) {
		e.printStackTrace();
	}catch (NullPointerException e) {
		e.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public static void go() throws IOException,JAXBException{

 }
}
